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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupStorageLocation extends AbstractModel{

    /**
    * Backup repository name	
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Repository region, such as `ap-guangzhou`	
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * The provider of storage service. It defaults to Tencent Cloud. 	
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * COS bucket name. For COS storage type, it must start with the prefix `tke-backup`. 	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS bucket path 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Storage repository status 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Status information 	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Last checked time 	
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastValidationTime")
    @Expose
    private String LastValidationTime;

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
     * Get The provider of storage service. It defaults to Tencent Cloud. 	
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Provider The provider of storage service. It defaults to Tencent Cloud. 	
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set The provider of storage service. It defaults to Tencent Cloud. 	
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Provider The provider of storage service. It defaults to Tencent Cloud. 	
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get COS bucket name. For COS storage type, it must start with the prefix `tke-backup`. 	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bucket COS bucket name. For COS storage type, it must start with the prefix `tke-backup`. 	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS bucket name. For COS storage type, it must start with the prefix `tke-backup`. 	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bucket COS bucket name. For COS storage type, it must start with the prefix `tke-backup`. 	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS bucket path 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Path COS bucket path 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set COS bucket path 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Path COS bucket path 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Storage repository status 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return State Storage repository status 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Storage repository status 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param State Storage repository status 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Status information 	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Status information 	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Status information 	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Status information 	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Last checked time 	
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return LastValidationTime Last checked time 	
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public String getLastValidationTime() {
        return this.LastValidationTime;
    }

    /**
     * Set Last checked time 	
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param LastValidationTime Last checked time 	
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setLastValidationTime(String LastValidationTime) {
        this.LastValidationTime = LastValidationTime;
    }

    public BackupStorageLocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupStorageLocation(BackupStorageLocation source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.LastValidationTime != null) {
            this.LastValidationTime = new String(source.LastValidationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "LastValidationTime", this.LastValidationTime);

    }
}

