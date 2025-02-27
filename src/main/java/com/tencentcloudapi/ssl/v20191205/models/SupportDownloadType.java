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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SupportDownloadType extends AbstractModel {

    /**
    * Whether the available format of nginx can be downloaded.
    */
    @SerializedName("NGINX")
    @Expose
    private Boolean NGINX;

    /**
    * Whether the available format of apache can be downloaded.
    */
    @SerializedName("APACHE")
    @Expose
    private Boolean APACHE;

    /**
    * Whether the available format of tomcat can be downloaded.
    */
    @SerializedName("TOMCAT")
    @Expose
    private Boolean TOMCAT;

    /**
    * Whether the available format of iis can be downloaded.
    */
    @SerializedName("IIS")
    @Expose
    private Boolean IIS;

    /**
    * Indicates whether the jks format can be downloaded.
    */
    @SerializedName("JKS")
    @Expose
    private Boolean JKS;

    /**
    * Indicates whether other formats can be downloaded.
    */
    @SerializedName("OTHER")
    @Expose
    private Boolean OTHER;

    /**
    * Indicates whether the root certificate can be downloaded.
    */
    @SerializedName("ROOT")
    @Expose
    private Boolean ROOT;

    /**
     * Get Whether the available format of nginx can be downloaded. 
     * @return NGINX Whether the available format of nginx can be downloaded.
     */
    public Boolean getNGINX() {
        return this.NGINX;
    }

    /**
     * Set Whether the available format of nginx can be downloaded.
     * @param NGINX Whether the available format of nginx can be downloaded.
     */
    public void setNGINX(Boolean NGINX) {
        this.NGINX = NGINX;
    }

    /**
     * Get Whether the available format of apache can be downloaded. 
     * @return APACHE Whether the available format of apache can be downloaded.
     */
    public Boolean getAPACHE() {
        return this.APACHE;
    }

    /**
     * Set Whether the available format of apache can be downloaded.
     * @param APACHE Whether the available format of apache can be downloaded.
     */
    public void setAPACHE(Boolean APACHE) {
        this.APACHE = APACHE;
    }

    /**
     * Get Whether the available format of tomcat can be downloaded. 
     * @return TOMCAT Whether the available format of tomcat can be downloaded.
     */
    public Boolean getTOMCAT() {
        return this.TOMCAT;
    }

    /**
     * Set Whether the available format of tomcat can be downloaded.
     * @param TOMCAT Whether the available format of tomcat can be downloaded.
     */
    public void setTOMCAT(Boolean TOMCAT) {
        this.TOMCAT = TOMCAT;
    }

    /**
     * Get Whether the available format of iis can be downloaded. 
     * @return IIS Whether the available format of iis can be downloaded.
     */
    public Boolean getIIS() {
        return this.IIS;
    }

    /**
     * Set Whether the available format of iis can be downloaded.
     * @param IIS Whether the available format of iis can be downloaded.
     */
    public void setIIS(Boolean IIS) {
        this.IIS = IIS;
    }

    /**
     * Get Indicates whether the jks format can be downloaded. 
     * @return JKS Indicates whether the jks format can be downloaded.
     */
    public Boolean getJKS() {
        return this.JKS;
    }

    /**
     * Set Indicates whether the jks format can be downloaded.
     * @param JKS Indicates whether the jks format can be downloaded.
     */
    public void setJKS(Boolean JKS) {
        this.JKS = JKS;
    }

    /**
     * Get Indicates whether other formats can be downloaded. 
     * @return OTHER Indicates whether other formats can be downloaded.
     */
    public Boolean getOTHER() {
        return this.OTHER;
    }

    /**
     * Set Indicates whether other formats can be downloaded.
     * @param OTHER Indicates whether other formats can be downloaded.
     */
    public void setOTHER(Boolean OTHER) {
        this.OTHER = OTHER;
    }

    /**
     * Get Indicates whether the root certificate can be downloaded. 
     * @return ROOT Indicates whether the root certificate can be downloaded.
     */
    public Boolean getROOT() {
        return this.ROOT;
    }

    /**
     * Set Indicates whether the root certificate can be downloaded.
     * @param ROOT Indicates whether the root certificate can be downloaded.
     */
    public void setROOT(Boolean ROOT) {
        this.ROOT = ROOT;
    }

    public SupportDownloadType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SupportDownloadType(SupportDownloadType source) {
        if (source.NGINX != null) {
            this.NGINX = new Boolean(source.NGINX);
        }
        if (source.APACHE != null) {
            this.APACHE = new Boolean(source.APACHE);
        }
        if (source.TOMCAT != null) {
            this.TOMCAT = new Boolean(source.TOMCAT);
        }
        if (source.IIS != null) {
            this.IIS = new Boolean(source.IIS);
        }
        if (source.JKS != null) {
            this.JKS = new Boolean(source.JKS);
        }
        if (source.OTHER != null) {
            this.OTHER = new Boolean(source.OTHER);
        }
        if (source.ROOT != null) {
            this.ROOT = new Boolean(source.ROOT);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NGINX", this.NGINX);
        this.setParamSimple(map, prefix + "APACHE", this.APACHE);
        this.setParamSimple(map, prefix + "TOMCAT", this.TOMCAT);
        this.setParamSimple(map, prefix + "IIS", this.IIS);
        this.setParamSimple(map, prefix + "JKS", this.JKS);
        this.setParamSimple(map, prefix + "OTHER", this.OTHER);
        this.setParamSimple(map, prefix + "ROOT", this.ROOT);

    }
}

