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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVLPlanRequest extends AbstractModel {

    /**
    * <p>Plan ID</p>
    */
    @SerializedName("VLPlanId")
    @Expose
    private String VLPlanId;

    /**
    * <p>New plan name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>New plan description.</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>ID of the newly associated visual understanding template</p>
    */
    @SerializedName("VLTemplateId")
    @Expose
    private String VLTemplateId;

    /**
    * <p>New storage days, range [7, 1080]. 0 means no modification</p>
    */
    @SerializedName("FileExpires")
    @Expose
    private Long FileExpires;

    /**
    * <p>New callback configuration</p>
    */
    @SerializedName("Callback")
    @Expose
    private CallbackURL Callback;

    /**
     * Get <p>Plan ID</p> 
     * @return VLPlanId <p>Plan ID</p>
     */
    public String getVLPlanId() {
        return this.VLPlanId;
    }

    /**
     * Set <p>Plan ID</p>
     * @param VLPlanId <p>Plan ID</p>
     */
    public void setVLPlanId(String VLPlanId) {
        this.VLPlanId = VLPlanId;
    }

    /**
     * Get <p>New plan name</p> 
     * @return Name <p>New plan name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>New plan name</p>
     * @param Name <p>New plan name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>New plan description.</p> 
     * @return Describe <p>New plan description.</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>New plan description.</p>
     * @param Describe <p>New plan description.</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>ID of the newly associated visual understanding template</p> 
     * @return VLTemplateId <p>ID of the newly associated visual understanding template</p>
     */
    public String getVLTemplateId() {
        return this.VLTemplateId;
    }

    /**
     * Set <p>ID of the newly associated visual understanding template</p>
     * @param VLTemplateId <p>ID of the newly associated visual understanding template</p>
     */
    public void setVLTemplateId(String VLTemplateId) {
        this.VLTemplateId = VLTemplateId;
    }

    /**
     * Get <p>New storage days, range [7, 1080]. 0 means no modification</p> 
     * @return FileExpires <p>New storage days, range [7, 1080]. 0 means no modification</p>
     */
    public Long getFileExpires() {
        return this.FileExpires;
    }

    /**
     * Set <p>New storage days, range [7, 1080]. 0 means no modification</p>
     * @param FileExpires <p>New storage days, range [7, 1080]. 0 means no modification</p>
     */
    public void setFileExpires(Long FileExpires) {
        this.FileExpires = FileExpires;
    }

    /**
     * Get <p>New callback configuration</p> 
     * @return Callback <p>New callback configuration</p>
     */
    public CallbackURL getCallback() {
        return this.Callback;
    }

    /**
     * Set <p>New callback configuration</p>
     * @param Callback <p>New callback configuration</p>
     */
    public void setCallback(CallbackURL Callback) {
        this.Callback = Callback;
    }

    public ModifyVLPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVLPlanRequest(ModifyVLPlanRequest source) {
        if (source.VLPlanId != null) {
            this.VLPlanId = new String(source.VLPlanId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.VLTemplateId != null) {
            this.VLTemplateId = new String(source.VLTemplateId);
        }
        if (source.FileExpires != null) {
            this.FileExpires = new Long(source.FileExpires);
        }
        if (source.Callback != null) {
            this.Callback = new CallbackURL(source.Callback);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VLPlanId", this.VLPlanId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "VLTemplateId", this.VLTemplateId);
        this.setParamSimple(map, prefix + "FileExpires", this.FileExpires);
        this.setParamObj(map, prefix + "Callback.", this.Callback);

    }
}

