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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CFSConfig extends AbstractModel {

    /**
    * CFS instance ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Storage path.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Mounting type of CFS. Valid values: STORAGE and SOURCE, which respectively indicate the storage expansion mode and the data source mode. The default value is STORAGE.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MountType")
    @Expose
    private String MountType;

    /**
    * Protocol. Valid values: NFS and TURBO.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get CFS instance ID. 
     * @return Id CFS instance ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set CFS instance ID.
     * @param Id CFS instance ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Storage path. 
     * @return Path Storage path.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Storage path.
     * @param Path Storage path.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Mounting type of CFS. Valid values: STORAGE and SOURCE, which respectively indicate the storage expansion mode and the data source mode. The default value is STORAGE.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MountType Mounting type of CFS. Valid values: STORAGE and SOURCE, which respectively indicate the storage expansion mode and the data source mode. The default value is STORAGE.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMountType() {
        return this.MountType;
    }

    /**
     * Set Mounting type of CFS. Valid values: STORAGE and SOURCE, which respectively indicate the storage expansion mode and the data source mode. The default value is STORAGE.Note: This field may return null, indicating that no valid values can be obtained.
     * @param MountType Mounting type of CFS. Valid values: STORAGE and SOURCE, which respectively indicate the storage expansion mode and the data source mode. The default value is STORAGE.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMountType(String MountType) {
        this.MountType = MountType;
    }

    /**
     * Get Protocol. Valid values: NFS and TURBO.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Protocol. Valid values: NFS and TURBO.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Valid values: NFS and TURBO.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Protocol. Valid values: NFS and TURBO.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public CFSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CFSConfig(CFSConfig source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.MountType != null) {
            this.MountType = new String(source.MountType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "MountType", this.MountType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

