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
    * Whether it is the user's default bucket: 0: default bucket, 1: non-default bucket
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultBucket")
    @Expose
    private Long DefaultBucket;

    /**
    * Managed storage short name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShortName")
    @Expose
    private String ShortName;

    /**
    * Description information of the bucket
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The status of the managed bucket. Current values: creating, bind, readOnly, and isolate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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

    /**
     * Get Whether it is the user's default bucket: 0: default bucket, 1: non-default bucket
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultBucket Whether it is the user's default bucket: 0: default bucket, 1: non-default bucket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefaultBucket() {
        return this.DefaultBucket;
    }

    /**
     * Set Whether it is the user's default bucket: 0: default bucket, 1: non-default bucket
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultBucket Whether it is the user's default bucket: 0: default bucket, 1: non-default bucket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultBucket(Long DefaultBucket) {
        this.DefaultBucket = DefaultBucket;
    }

    /**
     * Get Managed storage short name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShortName Managed storage short name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getShortName() {
        return this.ShortName;
    }

    /**
     * Set Managed storage short name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShortName Managed storage short name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShortName(String ShortName) {
        this.ShortName = ShortName;
    }

    /**
     * Get Description information of the bucket
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description information of the bucket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description information of the bucket
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description information of the bucket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The status of the managed bucket. Current values: creating, bind, readOnly, and isolate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status The status of the managed bucket. Current values: creating, bind, readOnly, and isolate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The status of the managed bucket. Current values: creating, bind, readOnly, and isolate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status The status of the managed bucket. Current values: creating, bind, readOnly, and isolate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
        if (source.DefaultBucket != null) {
            this.DefaultBucket = new Long(source.DefaultBucket);
        }
        if (source.ShortName != null) {
            this.ShortName = new String(source.ShortName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        this.setParamSimple(map, prefix + "DefaultBucket", this.DefaultBucket);
        this.setParamSimple(map, prefix + "ShortName", this.ShortName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

