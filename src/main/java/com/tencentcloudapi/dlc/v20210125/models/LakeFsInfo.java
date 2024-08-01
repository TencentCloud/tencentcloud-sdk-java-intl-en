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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LakeFsInfo extends AbstractModel {

    /**
    * Managed storage name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Managed storage type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Capacity
    */
    @SerializedName("SpaceUsedSize")
    @Expose
    private Float SpaceUsedSize;

    /**
    * Timestamp of the creation time
    */
    @SerializedName("CreateTimeStamp")
    @Expose
    private Long CreateTimeStamp;

    /**
     * Get Managed storage name 
     * @return Name Managed storage name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Managed storage name
     * @param Name Managed storage name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Managed storage type 
     * @return Type Managed storage type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Managed storage type
     * @param Type Managed storage type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Capacity 
     * @return SpaceUsedSize Capacity
     */
    public Float getSpaceUsedSize() {
        return this.SpaceUsedSize;
    }

    /**
     * Set Capacity
     * @param SpaceUsedSize Capacity
     */
    public void setSpaceUsedSize(Float SpaceUsedSize) {
        this.SpaceUsedSize = SpaceUsedSize;
    }

    /**
     * Get Timestamp of the creation time 
     * @return CreateTimeStamp Timestamp of the creation time
     */
    public Long getCreateTimeStamp() {
        return this.CreateTimeStamp;
    }

    /**
     * Set Timestamp of the creation time
     * @param CreateTimeStamp Timestamp of the creation time
     */
    public void setCreateTimeStamp(Long CreateTimeStamp) {
        this.CreateTimeStamp = CreateTimeStamp;
    }

    public LakeFsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LakeFsInfo(LakeFsInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SpaceUsedSize != null) {
            this.SpaceUsedSize = new Float(source.SpaceUsedSize);
        }
        if (source.CreateTimeStamp != null) {
            this.CreateTimeStamp = new Long(source.CreateTimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SpaceUsedSize", this.SpaceUsedSize);
        this.setParamSimple(map, prefix + "CreateTimeStamp", this.CreateTimeStamp);

    }
}

