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
    * 
    */
    @SerializedName("NGINX")
    @Expose
    private Boolean NGINX;

    /**
    * 
    */
    @SerializedName("APACHE")
    @Expose
    private Boolean APACHE;

    /**
    * 
    */
    @SerializedName("TOMCAT")
    @Expose
    private Boolean TOMCAT;

    /**
    * 
    */
    @SerializedName("IIS")
    @Expose
    private Boolean IIS;

    /**
    * 
    */
    @SerializedName("JKS")
    @Expose
    private Boolean JKS;

    /**
    * 
    */
    @SerializedName("OTHER")
    @Expose
    private Boolean OTHER;

    /**
    * 
    */
    @SerializedName("ROOT")
    @Expose
    private Boolean ROOT;

    /**
     * Get  
     * @return NGINX 
     */
    public Boolean getNGINX() {
        return this.NGINX;
    }

    /**
     * Set 
     * @param NGINX 
     */
    public void setNGINX(Boolean NGINX) {
        this.NGINX = NGINX;
    }

    /**
     * Get  
     * @return APACHE 
     */
    public Boolean getAPACHE() {
        return this.APACHE;
    }

    /**
     * Set 
     * @param APACHE 
     */
    public void setAPACHE(Boolean APACHE) {
        this.APACHE = APACHE;
    }

    /**
     * Get  
     * @return TOMCAT 
     */
    public Boolean getTOMCAT() {
        return this.TOMCAT;
    }

    /**
     * Set 
     * @param TOMCAT 
     */
    public void setTOMCAT(Boolean TOMCAT) {
        this.TOMCAT = TOMCAT;
    }

    /**
     * Get  
     * @return IIS 
     */
    public Boolean getIIS() {
        return this.IIS;
    }

    /**
     * Set 
     * @param IIS 
     */
    public void setIIS(Boolean IIS) {
        this.IIS = IIS;
    }

    /**
     * Get  
     * @return JKS 
     */
    public Boolean getJKS() {
        return this.JKS;
    }

    /**
     * Set 
     * @param JKS 
     */
    public void setJKS(Boolean JKS) {
        this.JKS = JKS;
    }

    /**
     * Get  
     * @return OTHER 
     */
    public Boolean getOTHER() {
        return this.OTHER;
    }

    /**
     * Set 
     * @param OTHER 
     */
    public void setOTHER(Boolean OTHER) {
        this.OTHER = OTHER;
    }

    /**
     * Get  
     * @return ROOT 
     */
    public Boolean getROOT() {
        return this.ROOT;
    }

    /**
     * Set 
     * @param ROOT 
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

