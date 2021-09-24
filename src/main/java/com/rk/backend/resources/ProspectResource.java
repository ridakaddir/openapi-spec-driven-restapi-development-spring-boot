package com.rk.backend.resources;

import com.rk.backend.api.ProspectApi;
import com.rk.backend.model.ProspectDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class ProspectResource implements ProspectApi {

    @Override
    public ResponseEntity<ProspectDto> createProspect(ProspectDto prospectDto) {


        log.info("prospectDto " +  prospectDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(prospectDto) ;


    }
}
