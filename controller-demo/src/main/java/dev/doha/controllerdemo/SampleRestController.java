package dev.doha.controllerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/rest")
public class SampleRestController {
    private static final Logger logger = LoggerFactory.getLogger(SampleRestController.class);

    @GetMapping(
            "/sample-payload"
    )
    public SamplePayload samplePayloadGet(){
        return new SamplePayload("doha", 25, "Developer");
    }
    @PostMapping("/sample-payload")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void samplePayloadPost(@RequestBody SamplePayload samplePayload){
        logger.info(samplePayload.toString());
    }

    @PostMapping(
            value = "/sample-multipart",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void sampleMultipartPost(
            @RequestParam("name") String name,
            @RequestParam("age") Integer age,
            @RequestParam("occupation") String occupation,
            @RequestParam(value = "file", required = false)MultipartFile multipartFile
            ){
        logger.info("name:"+ name);
        logger.info("age:"+ age);
        logger.info("occupation:"+ occupation);
        logger.info("file original name:"+ multipartFile.getOriginalFilename());
    }
}
