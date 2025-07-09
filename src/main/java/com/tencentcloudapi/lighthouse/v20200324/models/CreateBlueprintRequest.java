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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBlueprintRequest extends AbstractModel {

    /**
    * Image name, which can contain up to 60 characters.
    */
    @SerializedName("BlueprintName")
    @Expose
    private String BlueprintName;

    /**
    * Image description, which can contain up to 60 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * ID of the instance for which to make an image.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Whether to forcibly shut down the instance before creating the image 
Valid values: 
`True`: Shut down and instance first 
`False`: Create the image when the instance is running 
Default: `True` 
Note that if you create an image when the instance is running, there might be data loss.
    */
    @SerializedName("ForcePowerOff")
    @Expose
    private Boolean ForcePowerOff;

    /**
     * Get Image name, which can contain up to 60 characters. 
     * @return BlueprintName Image name, which can contain up to 60 characters.
     */
    public String getBlueprintName() {
        return this.BlueprintName;
    }

    /**
     * Set Image name, which can contain up to 60 characters.
     * @param BlueprintName Image name, which can contain up to 60 characters.
     */
    public void setBlueprintName(String BlueprintName) {
        this.BlueprintName = BlueprintName;
    }

    /**
     * Get Image description, which can contain up to 60 characters. 
     * @return Description Image description, which can contain up to 60 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Image description, which can contain up to 60 characters.
     * @param Description Image description, which can contain up to 60 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get ID of the instance for which to make an image. 
     * @return InstanceId ID of the instance for which to make an image.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance for which to make an image.
     * @param InstanceId ID of the instance for which to make an image.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Whether to forcibly shut down the instance before creating the image 
Valid values: 
`True`: Shut down and instance first 
`False`: Create the image when the instance is running 
Default: `True` 
Note that if you create an image when the instance is running, there might be data loss. 
     * @return ForcePowerOff Whether to forcibly shut down the instance before creating the image 
Valid values: 
`True`: Shut down and instance first 
`False`: Create the image when the instance is running 
Default: `True` 
Note that if you create an image when the instance is running, there might be data loss.
     */
    public Boolean getForcePowerOff() {
        return this.ForcePowerOff;
    }

    /**
     * Set Whether to forcibly shut down the instance before creating the image 
Valid values: 
`True`: Shut down and instance first 
`False`: Create the image when the instance is running 
Default: `True` 
Note that if you create an image when the instance is running, there might be data loss.
     * @param ForcePowerOff Whether to forcibly shut down the instance before creating the image 
Valid values: 
`True`: Shut down and instance first 
`False`: Create the image when the instance is running 
Default: `True` 
Note that if you create an image when the instance is running, there might be data loss.
     */
    public void setForcePowerOff(Boolean ForcePowerOff) {
        this.ForcePowerOff = ForcePowerOff;
    }

    public CreateBlueprintRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBlueprintRequest(CreateBlueprintRequest source) {
        if (source.BlueprintName != null) {
            this.BlueprintName = new String(source.BlueprintName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ForcePowerOff != null) {
            this.ForcePowerOff = new Boolean(source.ForcePowerOff);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlueprintName", this.BlueprintName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ForcePowerOff", this.ForcePowerOff);

    }
}

