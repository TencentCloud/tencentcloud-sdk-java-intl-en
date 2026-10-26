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

public class CreateVLPlanRequest extends AbstractModel {

    /**
    * <p>Plan name. Supports Chinese, English, digits, _ and -. Up to 32 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>ID of the associated visual understanding template</p>
    */
    @SerializedName("VLTemplateId")
    @Expose
    private String VLTemplateId;

    /**
    * <p>Plan description. Up to 256 characters.</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>Number of days to store screenshot files. Value range: [7, 1080]. Required in image mode. Do not pass this parameter in video mode.</p>
    */
    @SerializedName("FileExpires")
    @Expose
    private Long FileExpires;

    /**
    * <p>Callback notification configuration</p>
    */
    @SerializedName("Callback")
    @Expose
    private CallbackURL Callback;

    /**
     * Get <p>Plan name. Supports Chinese, English, digits, _ and -. Up to 32 characters.</p> 
     * @return Name <p>Plan name. Supports Chinese, English, digits, _ and -. Up to 32 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Plan name. Supports Chinese, English, digits, _ and -. Up to 32 characters.</p>
     * @param Name <p>Plan name. Supports Chinese, English, digits, _ and -. Up to 32 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>ID of the associated visual understanding template</p> 
     * @return VLTemplateId <p>ID of the associated visual understanding template</p>
     */
    public String getVLTemplateId() {
        return this.VLTemplateId;
    }

    /**
     * Set <p>ID of the associated visual understanding template</p>
     * @param VLTemplateId <p>ID of the associated visual understanding template</p>
     */
    public void setVLTemplateId(String VLTemplateId) {
        this.VLTemplateId = VLTemplateId;
    }

    /**
     * Get <p>Plan description. Up to 256 characters.</p> 
     * @return Describe <p>Plan description. Up to 256 characters.</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>Plan description. Up to 256 characters.</p>
     * @param Describe <p>Plan description. Up to 256 characters.</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>Number of days to store screenshot files. Value range: [7, 1080]. Required in image mode. Do not pass this parameter in video mode.</p> 
     * @return FileExpires <p>Number of days to store screenshot files. Value range: [7, 1080]. Required in image mode. Do not pass this parameter in video mode.</p>
     */
    public Long getFileExpires() {
        return this.FileExpires;
    }

    /**
     * Set <p>Number of days to store screenshot files. Value range: [7, 1080]. Required in image mode. Do not pass this parameter in video mode.</p>
     * @param FileExpires <p>Number of days to store screenshot files. Value range: [7, 1080]. Required in image mode. Do not pass this parameter in video mode.</p>
     */
    public void setFileExpires(Long FileExpires) {
        this.FileExpires = FileExpires;
    }

    /**
     * Get <p>Callback notification configuration</p> 
     * @return Callback <p>Callback notification configuration</p>
     */
    public CallbackURL getCallback() {
        return this.Callback;
    }

    /**
     * Set <p>Callback notification configuration</p>
     * @param Callback <p>Callback notification configuration</p>
     */
    public void setCallback(CallbackURL Callback) {
        this.Callback = Callback;
    }

    public CreateVLPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVLPlanRequest(CreateVLPlanRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VLTemplateId != null) {
            this.VLTemplateId = new String(source.VLTemplateId);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VLTemplateId", this.VLTemplateId);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "FileExpires", this.FileExpires);
        this.setParamObj(map, prefix + "Callback.", this.Callback);

    }
}

