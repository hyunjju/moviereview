package kr.co.hjsoft.moviereview.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@Log4j2
public class UploadController {
    //파일 업로드 처리 메소드
    @PostMapping(value = "/uploadajax")
    public void uploadFile(MultipartFile [] uploadFiles){
        for (MultipartFile uploadFile : uploadFiles){
            //업로드 되는 원본 파일 이름 출력
            String originalName = uploadFile.getOriginalFilename();
            String fileName = originalName.substring(originalName.lastIndexOf("\\") +1);
            log.info("File Name:" + fileName);
        }
    }
}
