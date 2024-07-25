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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVolumeRequest extends AbstractModel {

    /**
    * Environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Volume type. Valid values:
* SHARED: Multi-point mount shared storage
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Volume specifications. Valid values:

- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Volume size (GB), which is required to be specified for the Turbo series.
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
     * Get Environment ID 
     * @return EnvironmentId Environment ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
     * @param EnvironmentId Environment ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Volume type. Valid values:
* SHARED: Multi-point mount shared storage 
     * @return Type Volume type. Valid values:
* SHARED: Multi-point mount shared storage
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Volume type. Valid values:
* SHARED: Multi-point mount shared storage
     * @param Type Volume type. Valid values:
* SHARED: Multi-point mount shared storage
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Volume specifications. Valid values:

- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo 
     * @return Spec Volume specifications. Valid values:

- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Volume specifications. Valid values:

- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
     * @param Spec Volume specifications. Valid values:

- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Volume size (GB), which is required to be specified for the Turbo series. 
     * @return Capacity Volume size (GB), which is required to be specified for the Turbo series.
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set Volume size (GB), which is required to be specified for the Turbo series.
     * @param Capacity Volume size (GB), which is required to be specified for the Turbo series.
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    public CreateVolumeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVolumeRequest(CreateVolumeRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);

    }
}

