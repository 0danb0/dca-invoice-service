package com.danb.dca.product_serivce.enums;

import lombok.Getter;

@Getter
public enum ErrorMsg {

    DCA_IVC_SRV_01("DCA-IVC-SRV-01", "Invalid fields:", ""),

    DCA_IVC_SRV_02("DCA-IVC-SRV-02", "Invalid fields: application-license", "Invalid or inactive key, contact support."),

    DCA_IVC_SRV_03("DCA-IVC-SRV-03", "S3 Internal error", "There are some trouble with S3 service, please, contact support."),

    DCA_IVC_SRV_99("DCA-IVC-SRV-99", "Generic error", "");

    private final String code;

    private final String message;

    private final String detail;


    ErrorMsg(String code, String message, String detail) {
        this.code = code;
        this.message = message;
        this.detail = detail;
    }
}

