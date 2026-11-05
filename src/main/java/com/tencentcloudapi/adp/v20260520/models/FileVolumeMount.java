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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileVolumeMount extends AbstractModel {

    /**
    * <p>Access mode: RO=read-only, RW=read-write; required. Only RW can be used when mounting to /workdir.</p>
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * <p>Absolute mount directory in the sandbox; /workdir can be mounted at most once and only RW can be used.</p>
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * <p>Cloud disk identification</p>
    */
    @SerializedName("VolumeId")
    @Expose
    private String VolumeId;

    /**
    * <p>Server-side generated mount flag. Reserved for modification, optional for new additions.</p>
    */
    @SerializedName("MountId")
    @Expose
    private String MountId;

    /**
    * <p>Path relative to the root directory of cloud disk data; an empty string indicates mounting the entire data root directory.</p>
    */
    @SerializedName("RelativePath")
    @Expose
    private String RelativePath;

    /**
    * <p>Cloud disk name. It is supplemented by the server only when querying the application configuration and ignored during modification. It is empty when it cannot be obtained and does not impact the mount configuration.</p>
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
     * Get <p>Access mode: RO=read-only, RW=read-write; required. Only RW can be used when mounting to /workdir.</p> 
     * @return AccessMode <p>Access mode: RO=read-only, RW=read-write; required. Only RW can be used when mounting to /workdir.</p>
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>Access mode: RO=read-only, RW=read-write; required. Only RW can be used when mounting to /workdir.</p>
     * @param AccessMode <p>Access mode: RO=read-only, RW=read-write; required. Only RW can be used when mounting to /workdir.</p>
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get <p>Absolute mount directory in the sandbox; /workdir can be mounted at most once and only RW can be used.</p> 
     * @return MountPath <p>Absolute mount directory in the sandbox; /workdir can be mounted at most once and only RW can be used.</p>
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set <p>Absolute mount directory in the sandbox; /workdir can be mounted at most once and only RW can be used.</p>
     * @param MountPath <p>Absolute mount directory in the sandbox; /workdir can be mounted at most once and only RW can be used.</p>
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get <p>Cloud disk identification</p> 
     * @return VolumeId <p>Cloud disk identification</p>
     */
    public String getVolumeId() {
        return this.VolumeId;
    }

    /**
     * Set <p>Cloud disk identification</p>
     * @param VolumeId <p>Cloud disk identification</p>
     */
    public void setVolumeId(String VolumeId) {
        this.VolumeId = VolumeId;
    }

    /**
     * Get <p>Server-side generated mount flag. Reserved for modification, optional for new additions.</p> 
     * @return MountId <p>Server-side generated mount flag. Reserved for modification, optional for new additions.</p>
     */
    public String getMountId() {
        return this.MountId;
    }

    /**
     * Set <p>Server-side generated mount flag. Reserved for modification, optional for new additions.</p>
     * @param MountId <p>Server-side generated mount flag. Reserved for modification, optional for new additions.</p>
     */
    public void setMountId(String MountId) {
        this.MountId = MountId;
    }

    /**
     * Get <p>Path relative to the root directory of cloud disk data; an empty string indicates mounting the entire data root directory.</p> 
     * @return RelativePath <p>Path relative to the root directory of cloud disk data; an empty string indicates mounting the entire data root directory.</p>
     */
    public String getRelativePath() {
        return this.RelativePath;
    }

    /**
     * Set <p>Path relative to the root directory of cloud disk data; an empty string indicates mounting the entire data root directory.</p>
     * @param RelativePath <p>Path relative to the root directory of cloud disk data; an empty string indicates mounting the entire data root directory.</p>
     */
    public void setRelativePath(String RelativePath) {
        this.RelativePath = RelativePath;
    }

    /**
     * Get <p>Cloud disk name. It is supplemented by the server only when querying the application configuration and ignored during modification. It is empty when it cannot be obtained and does not impact the mount configuration.</p> 
     * @return VolumeName <p>Cloud disk name. It is supplemented by the server only when querying the application configuration and ignored during modification. It is empty when it cannot be obtained and does not impact the mount configuration.</p>
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set <p>Cloud disk name. It is supplemented by the server only when querying the application configuration and ignored during modification. It is empty when it cannot be obtained and does not impact the mount configuration.</p>
     * @param VolumeName <p>Cloud disk name. It is supplemented by the server only when querying the application configuration and ignored during modification. It is empty when it cannot be obtained and does not impact the mount configuration.</p>
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
    }

    public FileVolumeMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileVolumeMount(FileVolumeMount source) {
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.VolumeId != null) {
            this.VolumeId = new String(source.VolumeId);
        }
        if (source.MountId != null) {
            this.MountId = new String(source.MountId);
        }
        if (source.RelativePath != null) {
            this.RelativePath = new String(source.RelativePath);
        }
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamSimple(map, prefix + "VolumeId", this.VolumeId);
        this.setParamSimple(map, prefix + "MountId", this.MountId);
        this.setParamSimple(map, prefix + "RelativePath", this.RelativePath);
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);

    }
}

