/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlgType extends AbstractModel{

    /**
    * Whether FTP ALG is enabled
    */
    @SerializedName("Ftp")
    @Expose
    private Boolean Ftp;

    /**
    * Whether SIP ALG is enabled
    */
    @SerializedName("Sip")
    @Expose
    private Boolean Sip;

    /**
     * Get Whether FTP ALG is enabled 
     * @return Ftp Whether FTP ALG is enabled
     */
    public Boolean getFtp() {
        return this.Ftp;
    }

    /**
     * Set Whether FTP ALG is enabled
     * @param Ftp Whether FTP ALG is enabled
     */
    public void setFtp(Boolean Ftp) {
        this.Ftp = Ftp;
    }

    /**
     * Get Whether SIP ALG is enabled 
     * @return Sip Whether SIP ALG is enabled
     */
    public Boolean getSip() {
        return this.Sip;
    }

    /**
     * Set Whether SIP ALG is enabled
     * @param Sip Whether SIP ALG is enabled
     */
    public void setSip(Boolean Sip) {
        this.Sip = Sip;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ftp", this.Ftp);
        this.setParamSimple(map, prefix + "Sip", this.Sip);

    }
}

