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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CFSTurboVolume extends AbstractModel {

    /**
    * <p>Storage volume name.</p>
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    * <p>File system ID.</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>CFSId</p>
    */
    @SerializedName("FSId")
    @Expose
    private String FSId;

    /**
    * <p>Mount point IP address.</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>CFS subdirectory.</p>
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
    * <p>Lustre mount root directory. The default value is /cfs.</p>
    */
    @SerializedName("RootDir")
    @Expose
    private String RootDir;

    /**
     * Get <p>Storage volume name.</p> 
     * @return VolumeName <p>Storage volume name.</p>
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set <p>Storage volume name.</p>
     * @param VolumeName <p>Storage volume name.</p>
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
    }

    /**
     * Get <p>File system ID.</p> 
     * @return FileSystemId <p>File system ID.</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>File system ID.</p>
     * @param FileSystemId <p>File system ID.</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>CFSId</p> 
     * @return FSId <p>CFSId</p>
     */
    public String getFSId() {
        return this.FSId;
    }

    /**
     * Set <p>CFSId</p>
     * @param FSId <p>CFSId</p>
     */
    public void setFSId(String FSId) {
        this.FSId = FSId;
    }

    /**
     * Get <p>Mount point IP address.</p> 
     * @return Host <p>Mount point IP address.</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Mount point IP address.</p>
     * @param Host <p>Mount point IP address.</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>CFS subdirectory.</p> 
     * @return SubPath <p>CFS subdirectory.</p>
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set <p>CFS subdirectory.</p>
     * @param SubPath <p>CFS subdirectory.</p>
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    /**
     * Get <p>Lustre mount root directory. The default value is /cfs.</p> 
     * @return RootDir <p>Lustre mount root directory. The default value is /cfs.</p>
     */
    public String getRootDir() {
        return this.RootDir;
    }

    /**
     * Set <p>Lustre mount root directory. The default value is /cfs.</p>
     * @param RootDir <p>Lustre mount root directory. The default value is /cfs.</p>
     */
    public void setRootDir(String RootDir) {
        this.RootDir = RootDir;
    }

    public CFSTurboVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CFSTurboVolume(CFSTurboVolume source) {
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.FSId != null) {
            this.FSId = new String(source.FSId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
        if (source.RootDir != null) {
            this.RootDir = new String(source.RootDir);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "FSId", this.FSId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);
        this.setParamSimple(map, prefix + "RootDir", this.RootDir);

    }
}

