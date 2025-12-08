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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLibraryRequest extends AbstractModel {

    /**
    * Media library name. up to 50 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Specifies the remark, up to 250 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Specifies the full name of the bucket, which cannot be changed after creation. the current version no longer supports specified buckets.
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Bucket location cannot be changed after creation. the current version no longer supports specifying bucket location.
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * Media library configuration item. some parameters cannot be changed after creation.
    */
    @SerializedName("LibraryExtension")
    @Expose
    private LibraryExtension LibraryExtension;

    /**
     * Get Media library name. up to 50 characters. 
     * @return Name Media library name. up to 50 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Media library name. up to 50 characters.
     * @param Name Media library name. up to 50 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Specifies the remark, up to 250 characters. 
     * @return Remark Specifies the remark, up to 250 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Specifies the remark, up to 250 characters.
     * @param Remark Specifies the remark, up to 250 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Specifies the full name of the bucket, which cannot be changed after creation. the current version no longer supports specified buckets. 
     * @return BucketName Specifies the full name of the bucket, which cannot be changed after creation. the current version no longer supports specified buckets.
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Specifies the full name of the bucket, which cannot be changed after creation. the current version no longer supports specified buckets.
     * @param BucketName Specifies the full name of the bucket, which cannot be changed after creation. the current version no longer supports specified buckets.
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Bucket location cannot be changed after creation. the current version no longer supports specifying bucket location. 
     * @return BucketRegion Bucket location cannot be changed after creation. the current version no longer supports specifying bucket location.
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set Bucket location cannot be changed after creation. the current version no longer supports specifying bucket location.
     * @param BucketRegion Bucket location cannot be changed after creation. the current version no longer supports specifying bucket location.
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get Media library configuration item. some parameters cannot be changed after creation. 
     * @return LibraryExtension Media library configuration item. some parameters cannot be changed after creation.
     */
    public LibraryExtension getLibraryExtension() {
        return this.LibraryExtension;
    }

    /**
     * Set Media library configuration item. some parameters cannot be changed after creation.
     * @param LibraryExtension Media library configuration item. some parameters cannot be changed after creation.
     */
    public void setLibraryExtension(LibraryExtension LibraryExtension) {
        this.LibraryExtension = LibraryExtension;
    }

    public CreateLibraryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLibraryRequest(CreateLibraryRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.LibraryExtension != null) {
            this.LibraryExtension = new LibraryExtension(source.LibraryExtension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamObj(map, prefix + "LibraryExtension.", this.LibraryExtension);

    }
}

