/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleContentK8sAPI extends AbstractModel {

    /**
    * 
    */
    @SerializedName("RequestURI")
    @Expose
    private String RequestURI;

    /**
    * 
    */
    @SerializedName("Verb")
    @Expose
    private String Verb;

    /**
    * 
    */
    @SerializedName("RequestUser")
    @Expose
    private String RequestUser;

    /**
    * 
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 
    */
    @SerializedName("SourceIPS")
    @Expose
    private String SourceIPS;

    /**
    * 
    */
    @SerializedName("ResponseStatusCode")
    @Expose
    private String ResponseStatusCode;

    /**
    * 
    */
    @SerializedName("RequestObject")
    @Expose
    private String RequestObject;

    /**
    * 
    */
    @SerializedName("ResponseObject")
    @Expose
    private String ResponseObject;

    /**
    * 
    */
    @SerializedName("MountHostDir")
    @Expose
    private String MountHostDir;

    /**
    * 
    */
    @SerializedName("PodNameIP")
    @Expose
    private String PodNameIP;

    /**
    * 
    */
    @SerializedName("AuditID")
    @Expose
    private String AuditID;

    /**
     * Get  
     * @return RequestURI 
     */
    public String getRequestURI() {
        return this.RequestURI;
    }

    /**
     * Set 
     * @param RequestURI 
     */
    public void setRequestURI(String RequestURI) {
        this.RequestURI = RequestURI;
    }

    /**
     * Get  
     * @return Verb 
     */
    public String getVerb() {
        return this.Verb;
    }

    /**
     * Set 
     * @param Verb 
     */
    public void setVerb(String Verb) {
        this.Verb = Verb;
    }

    /**
     * Get  
     * @return RequestUser 
     */
    public String getRequestUser() {
        return this.RequestUser;
    }

    /**
     * Set 
     * @param RequestUser 
     */
    public void setRequestUser(String RequestUser) {
        this.RequestUser = RequestUser;
    }

    /**
     * Get  
     * @return UserAgent 
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 
     * @param UserAgent 
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get  
     * @return SourceIPS 
     */
    public String getSourceIPS() {
        return this.SourceIPS;
    }

    /**
     * Set 
     * @param SourceIPS 
     */
    public void setSourceIPS(String SourceIPS) {
        this.SourceIPS = SourceIPS;
    }

    /**
     * Get  
     * @return ResponseStatusCode 
     */
    public String getResponseStatusCode() {
        return this.ResponseStatusCode;
    }

    /**
     * Set 
     * @param ResponseStatusCode 
     */
    public void setResponseStatusCode(String ResponseStatusCode) {
        this.ResponseStatusCode = ResponseStatusCode;
    }

    /**
     * Get  
     * @return RequestObject 
     */
    public String getRequestObject() {
        return this.RequestObject;
    }

    /**
     * Set 
     * @param RequestObject 
     */
    public void setRequestObject(String RequestObject) {
        this.RequestObject = RequestObject;
    }

    /**
     * Get  
     * @return ResponseObject 
     */
    public String getResponseObject() {
        return this.ResponseObject;
    }

    /**
     * Set 
     * @param ResponseObject 
     */
    public void setResponseObject(String ResponseObject) {
        this.ResponseObject = ResponseObject;
    }

    /**
     * Get  
     * @return MountHostDir 
     */
    public String getMountHostDir() {
        return this.MountHostDir;
    }

    /**
     * Set 
     * @param MountHostDir 
     */
    public void setMountHostDir(String MountHostDir) {
        this.MountHostDir = MountHostDir;
    }

    /**
     * Get  
     * @return PodNameIP 
     */
    public String getPodNameIP() {
        return this.PodNameIP;
    }

    /**
     * Set 
     * @param PodNameIP 
     */
    public void setPodNameIP(String PodNameIP) {
        this.PodNameIP = PodNameIP;
    }

    /**
     * Get  
     * @return AuditID 
     */
    public String getAuditID() {
        return this.AuditID;
    }

    /**
     * Set 
     * @param AuditID 
     */
    public void setAuditID(String AuditID) {
        this.AuditID = AuditID;
    }

    public RuleContentK8sAPI() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleContentK8sAPI(RuleContentK8sAPI source) {
        if (source.RequestURI != null) {
            this.RequestURI = new String(source.RequestURI);
        }
        if (source.Verb != null) {
            this.Verb = new String(source.Verb);
        }
        if (source.RequestUser != null) {
            this.RequestUser = new String(source.RequestUser);
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.SourceIPS != null) {
            this.SourceIPS = new String(source.SourceIPS);
        }
        if (source.ResponseStatusCode != null) {
            this.ResponseStatusCode = new String(source.ResponseStatusCode);
        }
        if (source.RequestObject != null) {
            this.RequestObject = new String(source.RequestObject);
        }
        if (source.ResponseObject != null) {
            this.ResponseObject = new String(source.ResponseObject);
        }
        if (source.MountHostDir != null) {
            this.MountHostDir = new String(source.MountHostDir);
        }
        if (source.PodNameIP != null) {
            this.PodNameIP = new String(source.PodNameIP);
        }
        if (source.AuditID != null) {
            this.AuditID = new String(source.AuditID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestURI", this.RequestURI);
        this.setParamSimple(map, prefix + "Verb", this.Verb);
        this.setParamSimple(map, prefix + "RequestUser", this.RequestUser);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "SourceIPS", this.SourceIPS);
        this.setParamSimple(map, prefix + "ResponseStatusCode", this.ResponseStatusCode);
        this.setParamSimple(map, prefix + "RequestObject", this.RequestObject);
        this.setParamSimple(map, prefix + "ResponseObject", this.ResponseObject);
        this.setParamSimple(map, prefix + "MountHostDir", this.MountHostDir);
        this.setParamSimple(map, prefix + "PodNameIP", this.PodNameIP);
        this.setParamSimple(map, prefix + "AuditID", this.AuditID);

    }
}

