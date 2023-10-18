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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackupStorageLocationRequest extends AbstractModel {

    /**
    * Repository region, such as `ap-guangzhou`
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * COS bucket name. For COS storage type, it must start with the prefix `tke-backup`.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Backup repository name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The provider of storage service. It defaults to Tencent Cloud.
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * COS bucket path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get Repository region, such as `ap-guangzhou` 
     * @return StorageRegion Repository region, such as `ap-guangzhou`
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set Repository region, such as `ap-guangzhou`
     * @param StorageRegion Repository region, such as `ap-guangzhou`
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get COS bucket name. For COS storage type, it must start with the prefix `tke-backup`. 
     * @return Bucket COS bucket name. For COS storage type, it must start with the prefix `tke-backup`.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS bucket name. For COS storage type, it must start with the prefix `tke-backup`.
     * @param Bucket COS bucket name. For COS storage type, it must start with the prefix `tke-backup`.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Backup repository name 
     * @return Name Backup repository name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Backup repository name
     * @param Name Backup repository name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The provider of storage service. It defaults to Tencent Cloud. 
     * @return Provider The provider of storage service. It defaults to Tencent Cloud.
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set The provider of storage service. It defaults to Tencent Cloud.
     * @param Provider The provider of storage service. It defaults to Tencent Cloud.
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get COS bucket path 
     * @return Path COS bucket path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set COS bucket path
     * @param Path COS bucket path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public CreateBackupStorageLocationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupStorageLocationRequest(CreateBackupStorageLocationRequest source) {
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

