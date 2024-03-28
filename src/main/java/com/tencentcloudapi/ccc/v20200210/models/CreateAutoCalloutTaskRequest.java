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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAutoCalloutTaskRequest extends AbstractModel {

    /**
    * Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Task starting timestamp. Unix second-level timestamp.
    */
    @SerializedName("NotBefore")
    @Expose
    private Long NotBefore;

    /**
    * List of called numbers.
    */
    @SerializedName("Callees")
    @Expose
    private String [] Callees;

    /**
    * List of calling numbers.
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * IVR used for calling.
    */
    @SerializedName("IvrId")
    @Expose
    private Long IvrId;

    /**
    * Task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Task description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Task stop timestamp. Unix second-level timestamp.
    */
    @SerializedName("NotAfter")
    @Expose
    private Long NotAfter;

    /**
    * Maximum attempts.
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * Custom variables (supported only in advanced versions).
    */
    @SerializedName("Variables")
    @Expose
    private Variable [] Variables;

    /**
    * UUI
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * Property of the called.
    */
    @SerializedName("CalleeAttributes")
    @Expose
    private CalleeAttribute [] CalleeAttributes;

    /**
     * Get Application ID (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Task starting timestamp. Unix second-level timestamp. 
     * @return NotBefore Task starting timestamp. Unix second-level timestamp.
     */
    public Long getNotBefore() {
        return this.NotBefore;
    }

    /**
     * Set Task starting timestamp. Unix second-level timestamp.
     * @param NotBefore Task starting timestamp. Unix second-level timestamp.
     */
    public void setNotBefore(Long NotBefore) {
        this.NotBefore = NotBefore;
    }

    /**
     * Get List of called numbers. 
     * @return Callees List of called numbers.
     */
    public String [] getCallees() {
        return this.Callees;
    }

    /**
     * Set List of called numbers.
     * @param Callees List of called numbers.
     */
    public void setCallees(String [] Callees) {
        this.Callees = Callees;
    }

    /**
     * Get List of calling numbers. 
     * @return Callers List of calling numbers.
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set List of calling numbers.
     * @param Callers List of calling numbers.
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get IVR used for calling. 
     * @return IvrId IVR used for calling.
     */
    public Long getIvrId() {
        return this.IvrId;
    }

    /**
     * Set IVR used for calling.
     * @param IvrId IVR used for calling.
     */
    public void setIvrId(Long IvrId) {
        this.IvrId = IvrId;
    }

    /**
     * Get Task name. 
     * @return Name Task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task name.
     * @param Name Task name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Task description. 
     * @return Description Task description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Task description.
     * @param Description Task description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Task stop timestamp. Unix second-level timestamp. 
     * @return NotAfter Task stop timestamp. Unix second-level timestamp.
     */
    public Long getNotAfter() {
        return this.NotAfter;
    }

    /**
     * Set Task stop timestamp. Unix second-level timestamp.
     * @param NotAfter Task stop timestamp. Unix second-level timestamp.
     */
    public void setNotAfter(Long NotAfter) {
        this.NotAfter = NotAfter;
    }

    /**
     * Get Maximum attempts. 
     * @return Tries Maximum attempts.
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set Maximum attempts.
     * @param Tries Maximum attempts.
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get Custom variables (supported only in advanced versions). 
     * @return Variables Custom variables (supported only in advanced versions).
     */
    public Variable [] getVariables() {
        return this.Variables;
    }

    /**
     * Set Custom variables (supported only in advanced versions).
     * @param Variables Custom variables (supported only in advanced versions).
     */
    public void setVariables(Variable [] Variables) {
        this.Variables = Variables;
    }

    /**
     * Get UUI 
     * @return UUI UUI
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set UUI
     * @param UUI UUI
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    /**
     * Get Property of the called. 
     * @return CalleeAttributes Property of the called.
     */
    public CalleeAttribute [] getCalleeAttributes() {
        return this.CalleeAttributes;
    }

    /**
     * Set Property of the called.
     * @param CalleeAttributes Property of the called.
     */
    public void setCalleeAttributes(CalleeAttribute [] CalleeAttributes) {
        this.CalleeAttributes = CalleeAttributes;
    }

    public CreateAutoCalloutTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAutoCalloutTaskRequest(CreateAutoCalloutTaskRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.NotBefore != null) {
            this.NotBefore = new Long(source.NotBefore);
        }
        if (source.Callees != null) {
            this.Callees = new String[source.Callees.length];
            for (int i = 0; i < source.Callees.length; i++) {
                this.Callees[i] = new String(source.Callees[i]);
            }
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.IvrId != null) {
            this.IvrId = new Long(source.IvrId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NotAfter != null) {
            this.NotAfter = new Long(source.NotAfter);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
        }
        if (source.Variables != null) {
            this.Variables = new Variable[source.Variables.length];
            for (int i = 0; i < source.Variables.length; i++) {
                this.Variables[i] = new Variable(source.Variables[i]);
            }
        }
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
        }
        if (source.CalleeAttributes != null) {
            this.CalleeAttributes = new CalleeAttribute[source.CalleeAttributes.length];
            for (int i = 0; i < source.CalleeAttributes.length; i++) {
                this.CalleeAttributes[i] = new CalleeAttribute(source.CalleeAttributes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "NotBefore", this.NotBefore);
        this.setParamArraySimple(map, prefix + "Callees.", this.Callees);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "IvrId", this.IvrId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "NotAfter", this.NotAfter);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamArrayObj(map, prefix + "Variables.", this.Variables);
        this.setParamSimple(map, prefix + "UUI", this.UUI);
        this.setParamArrayObj(map, prefix + "CalleeAttributes.", this.CalleeAttributes);

    }
}

