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

public class GooseFSVolume extends AbstractModel {

    /**
    * <p>Storage volume name.</p>
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    * <p>GooseFS instance ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>GooseFS namespace.</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>Mount path in the namespace.</p>
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
    * <p>FuseVERSION description.</p>
    */
    @SerializedName("FuseVersion")
    @Expose
    private String FuseVersion;

    /**
    * <p>Client version description, for example, GOOSE-1.5.2.</p>
    */
    @SerializedName("ClientVersion")
    @Expose
    private String ClientVersion;

    /**
    * <p>Default mount parameter.</p>
    */
    @SerializedName("MountOptions")
    @Expose
    private String MountOptions;

    /**
    * <p>Default JVM parameter.</p>
    */
    @SerializedName("JvmOptions")
    @Expose
    private String JvmOptions;

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
     * Get <p>GooseFS instance ID.</p> 
     * @return ClusterId <p>GooseFS instance ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>GooseFS instance ID.</p>
     * @param ClusterId <p>GooseFS instance ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>GooseFS namespace.</p> 
     * @return Namespace <p>GooseFS namespace.</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>GooseFS namespace.</p>
     * @param Namespace <p>GooseFS namespace.</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>Mount path in the namespace.</p> 
     * @return SubPath <p>Mount path in the namespace.</p>
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set <p>Mount path in the namespace.</p>
     * @param SubPath <p>Mount path in the namespace.</p>
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    /**
     * Get <p>FuseVERSION description.</p> 
     * @return FuseVersion <p>FuseVERSION description.</p>
     */
    public String getFuseVersion() {
        return this.FuseVersion;
    }

    /**
     * Set <p>FuseVERSION description.</p>
     * @param FuseVersion <p>FuseVERSION description.</p>
     */
    public void setFuseVersion(String FuseVersion) {
        this.FuseVersion = FuseVersion;
    }

    /**
     * Get <p>Client version description, for example, GOOSE-1.5.2.</p> 
     * @return ClientVersion <p>Client version description, for example, GOOSE-1.5.2.</p>
     */
    public String getClientVersion() {
        return this.ClientVersion;
    }

    /**
     * Set <p>Client version description, for example, GOOSE-1.5.2.</p>
     * @param ClientVersion <p>Client version description, for example, GOOSE-1.5.2.</p>
     */
    public void setClientVersion(String ClientVersion) {
        this.ClientVersion = ClientVersion;
    }

    /**
     * Get <p>Default mount parameter.</p> 
     * @return MountOptions <p>Default mount parameter.</p>
     */
    public String getMountOptions() {
        return this.MountOptions;
    }

    /**
     * Set <p>Default mount parameter.</p>
     * @param MountOptions <p>Default mount parameter.</p>
     */
    public void setMountOptions(String MountOptions) {
        this.MountOptions = MountOptions;
    }

    /**
     * Get <p>Default JVM parameter.</p> 
     * @return JvmOptions <p>Default JVM parameter.</p>
     */
    public String getJvmOptions() {
        return this.JvmOptions;
    }

    /**
     * Set <p>Default JVM parameter.</p>
     * @param JvmOptions <p>Default JVM parameter.</p>
     */
    public void setJvmOptions(String JvmOptions) {
        this.JvmOptions = JvmOptions;
    }

    public GooseFSVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GooseFSVolume(GooseFSVolume source) {
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
        if (source.FuseVersion != null) {
            this.FuseVersion = new String(source.FuseVersion);
        }
        if (source.ClientVersion != null) {
            this.ClientVersion = new String(source.ClientVersion);
        }
        if (source.MountOptions != null) {
            this.MountOptions = new String(source.MountOptions);
        }
        if (source.JvmOptions != null) {
            this.JvmOptions = new String(source.JvmOptions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);
        this.setParamSimple(map, prefix + "FuseVersion", this.FuseVersion);
        this.setParamSimple(map, prefix + "ClientVersion", this.ClientVersion);
        this.setParamSimple(map, prefix + "MountOptions", this.MountOptions);
        this.setParamSimple(map, prefix + "JvmOptions", this.JvmOptions);

    }
}

