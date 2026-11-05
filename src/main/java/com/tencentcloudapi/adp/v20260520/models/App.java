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

public class App extends AbstractModel {

    /**
    * <p>Auxiliary information (sub-status/approval/appeal/search for resource/special status)</p>
    */
    @SerializedName("AuxiliaryInfo")
    @Expose
    private AppAuxiliaryInfo AuxiliaryInfo;

    /**
    * <p>Configuration.</p>
    */
    @SerializedName("Config")
    @Expose
    private AppConfig Config;

    /**
    * <p>Metadata</p>
    */
    @SerializedName("Metadata")
    @Expose
    private AppMetadata Metadata;

    /**
    * <p>Application key information</p>
    */
    @SerializedName("SecretInfo")
    @Expose
    private AppSecretInfo SecretInfo;

    /**
    * <p>Sharing link information (including access control)</p>
    */
    @SerializedName("ShareUrlInfo")
    @Expose
    private AppShareURLInfo ShareUrlInfo;

    /**
    * <p>Status.</p>
    */
    @SerializedName("Status")
    @Expose
    private AppStatusInfo Status;

    /**
    * <p>Business shared configuration</p>
    */
    @SerializedName("CorpShareConfig")
    @Expose
    private CorpShareConfig CorpShareConfig;

    /**
    * <p>List of shared knowledge bases referenced by the application</p>
    */
    @SerializedName("SharedKbList")
    @Expose
    private AppSharedKbInfo [] SharedKbList;

    /**
    * <p>portal shared configuration</p>
    */
    @SerializedName("PortalShareConfig")
    @Expose
    private PortalShareConfig PortalShareConfig;

    /**
    * <p>Application-mounted cloud disk</p>
    */
    @SerializedName("FileVolumeMountList")
    @Expose
    private FileVolumeMount [] FileVolumeMountList;

    /**
     * Get <p>Auxiliary information (sub-status/approval/appeal/search for resource/special status)</p> 
     * @return AuxiliaryInfo <p>Auxiliary information (sub-status/approval/appeal/search for resource/special status)</p>
     */
    public AppAuxiliaryInfo getAuxiliaryInfo() {
        return this.AuxiliaryInfo;
    }

    /**
     * Set <p>Auxiliary information (sub-status/approval/appeal/search for resource/special status)</p>
     * @param AuxiliaryInfo <p>Auxiliary information (sub-status/approval/appeal/search for resource/special status)</p>
     */
    public void setAuxiliaryInfo(AppAuxiliaryInfo AuxiliaryInfo) {
        this.AuxiliaryInfo = AuxiliaryInfo;
    }

    /**
     * Get <p>Configuration.</p> 
     * @return Config <p>Configuration.</p>
     */
    public AppConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>Configuration.</p>
     * @param Config <p>Configuration.</p>
     */
    public void setConfig(AppConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>Metadata</p> 
     * @return Metadata <p>Metadata</p>
     */
    public AppMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>Metadata</p>
     * @param Metadata <p>Metadata</p>
     */
    public void setMetadata(AppMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>Application key information</p> 
     * @return SecretInfo <p>Application key information</p>
     */
    public AppSecretInfo getSecretInfo() {
        return this.SecretInfo;
    }

    /**
     * Set <p>Application key information</p>
     * @param SecretInfo <p>Application key information</p>
     */
    public void setSecretInfo(AppSecretInfo SecretInfo) {
        this.SecretInfo = SecretInfo;
    }

    /**
     * Get <p>Sharing link information (including access control)</p> 
     * @return ShareUrlInfo <p>Sharing link information (including access control)</p>
     */
    public AppShareURLInfo getShareUrlInfo() {
        return this.ShareUrlInfo;
    }

    /**
     * Set <p>Sharing link information (including access control)</p>
     * @param ShareUrlInfo <p>Sharing link information (including access control)</p>
     */
    public void setShareUrlInfo(AppShareURLInfo ShareUrlInfo) {
        this.ShareUrlInfo = ShareUrlInfo;
    }

    /**
     * Get <p>Status.</p> 
     * @return Status <p>Status.</p>
     */
    public AppStatusInfo getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status.</p>
     * @param Status <p>Status.</p>
     */
    public void setStatus(AppStatusInfo Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Business shared configuration</p> 
     * @return CorpShareConfig <p>Business shared configuration</p>
     */
    public CorpShareConfig getCorpShareConfig() {
        return this.CorpShareConfig;
    }

    /**
     * Set <p>Business shared configuration</p>
     * @param CorpShareConfig <p>Business shared configuration</p>
     */
    public void setCorpShareConfig(CorpShareConfig CorpShareConfig) {
        this.CorpShareConfig = CorpShareConfig;
    }

    /**
     * Get <p>List of shared knowledge bases referenced by the application</p> 
     * @return SharedKbList <p>List of shared knowledge bases referenced by the application</p>
     */
    public AppSharedKbInfo [] getSharedKbList() {
        return this.SharedKbList;
    }

    /**
     * Set <p>List of shared knowledge bases referenced by the application</p>
     * @param SharedKbList <p>List of shared knowledge bases referenced by the application</p>
     */
    public void setSharedKbList(AppSharedKbInfo [] SharedKbList) {
        this.SharedKbList = SharedKbList;
    }

    /**
     * Get <p>portal shared configuration</p> 
     * @return PortalShareConfig <p>portal shared configuration</p>
     */
    public PortalShareConfig getPortalShareConfig() {
        return this.PortalShareConfig;
    }

    /**
     * Set <p>portal shared configuration</p>
     * @param PortalShareConfig <p>portal shared configuration</p>
     */
    public void setPortalShareConfig(PortalShareConfig PortalShareConfig) {
        this.PortalShareConfig = PortalShareConfig;
    }

    /**
     * Get <p>Application-mounted cloud disk</p> 
     * @return FileVolumeMountList <p>Application-mounted cloud disk</p>
     */
    public FileVolumeMount [] getFileVolumeMountList() {
        return this.FileVolumeMountList;
    }

    /**
     * Set <p>Application-mounted cloud disk</p>
     * @param FileVolumeMountList <p>Application-mounted cloud disk</p>
     */
    public void setFileVolumeMountList(FileVolumeMount [] FileVolumeMountList) {
        this.FileVolumeMountList = FileVolumeMountList;
    }

    public App() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public App(App source) {
        if (source.AuxiliaryInfo != null) {
            this.AuxiliaryInfo = new AppAuxiliaryInfo(source.AuxiliaryInfo);
        }
        if (source.Config != null) {
            this.Config = new AppConfig(source.Config);
        }
        if (source.Metadata != null) {
            this.Metadata = new AppMetadata(source.Metadata);
        }
        if (source.SecretInfo != null) {
            this.SecretInfo = new AppSecretInfo(source.SecretInfo);
        }
        if (source.ShareUrlInfo != null) {
            this.ShareUrlInfo = new AppShareURLInfo(source.ShareUrlInfo);
        }
        if (source.Status != null) {
            this.Status = new AppStatusInfo(source.Status);
        }
        if (source.CorpShareConfig != null) {
            this.CorpShareConfig = new CorpShareConfig(source.CorpShareConfig);
        }
        if (source.SharedKbList != null) {
            this.SharedKbList = new AppSharedKbInfo[source.SharedKbList.length];
            for (int i = 0; i < source.SharedKbList.length; i++) {
                this.SharedKbList[i] = new AppSharedKbInfo(source.SharedKbList[i]);
            }
        }
        if (source.PortalShareConfig != null) {
            this.PortalShareConfig = new PortalShareConfig(source.PortalShareConfig);
        }
        if (source.FileVolumeMountList != null) {
            this.FileVolumeMountList = new FileVolumeMount[source.FileVolumeMountList.length];
            for (int i = 0; i < source.FileVolumeMountList.length; i++) {
                this.FileVolumeMountList[i] = new FileVolumeMount(source.FileVolumeMountList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AuxiliaryInfo.", this.AuxiliaryInfo);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamObj(map, prefix + "SecretInfo.", this.SecretInfo);
        this.setParamObj(map, prefix + "ShareUrlInfo.", this.ShareUrlInfo);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamObj(map, prefix + "CorpShareConfig.", this.CorpShareConfig);
        this.setParamArrayObj(map, prefix + "SharedKbList.", this.SharedKbList);
        this.setParamObj(map, prefix + "PortalShareConfig.", this.PortalShareConfig);
        this.setParamArrayObj(map, prefix + "FileVolumeMountList.", this.FileVolumeMountList);

    }
}

