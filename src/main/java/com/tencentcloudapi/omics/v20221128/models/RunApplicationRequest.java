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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunApplicationRequest extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Run group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Delivery environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Project ID. (If you leave it blank, the default item in the specified region will be used.)
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Run group description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Run input COS path. (Either InputBase64 or InputCosUri must be selected.)
    */
    @SerializedName("InputCosUri")
    @Expose
    private String InputCosUri;

    /**
    * Run input JSON. Base64 encoding is required. (Either InputBase64 or InputCosUri must be selected.)
    */
    @SerializedName("InputBase64")
    @Expose
    private String InputBase64;

    /**
    * Batch deliver table ID. Leaving it blank indicates delivery in singleton mode.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Batch deliver table row UUID. Leaving it blank indicates all rows of the table.
    */
    @SerializedName("TableRowUuids")
    @Expose
    private String [] TableRowUuids;

    /**
    * Run cache cleanup time (hours). Leaving it blank or entering 0 indicates no cleanup.
    */
    @SerializedName("CacheClearDelay")
    @Expose
    private Long CacheClearDelay;

    /**
    * Application version ID. Leaving it blank indicates that the latest version is used.
    */
    @SerializedName("ApplicationVersionId")
    @Expose
    private String ApplicationVersionId;

    /**
    * WDL running option
    */
    @SerializedName("Option")
    @Expose
    private RunOption Option;

    /**
    * Nextflow running option
    */
    @SerializedName("NFOption")
    @Expose
    private NFOption NFOption;

    /**
    * Working directory. You can fill in the absolute path in the specified volume. If you leave it blank, the default path in the default volume will be used. Currently, only Nextflow is supported.
    */
    @SerializedName("WorkDir")
    @Expose
    private String WorkDir;

    /**
    * Access mode. Leaving it blank indicates it is private by default. Valid values:
- PRIVATE: Private application
- PUBLIC: Public application
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * Volume ID. If you leave it blank, the default volume will be used. Currently, only Nextflow is supported.
    */
    @SerializedName("VolumeIds")
    @Expose
    private String [] VolumeIds;

    /**
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Run group name 
     * @return Name Run group name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Run group name
     * @param Name Run group name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Delivery environment ID 
     * @return EnvironmentId Delivery environment ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Delivery environment ID
     * @param EnvironmentId Delivery environment ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Project ID. (If you leave it blank, the default item in the specified region will be used.) 
     * @return ProjectId Project ID. (If you leave it blank, the default item in the specified region will be used.)
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. (If you leave it blank, the default item in the specified region will be used.)
     * @param ProjectId Project ID. (If you leave it blank, the default item in the specified region will be used.)
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Run group description 
     * @return Description Run group description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Run group description
     * @param Description Run group description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Run input COS path. (Either InputBase64 or InputCosUri must be selected.) 
     * @return InputCosUri Run input COS path. (Either InputBase64 or InputCosUri must be selected.)
     */
    public String getInputCosUri() {
        return this.InputCosUri;
    }

    /**
     * Set Run input COS path. (Either InputBase64 or InputCosUri must be selected.)
     * @param InputCosUri Run input COS path. (Either InputBase64 or InputCosUri must be selected.)
     */
    public void setInputCosUri(String InputCosUri) {
        this.InputCosUri = InputCosUri;
    }

    /**
     * Get Run input JSON. Base64 encoding is required. (Either InputBase64 or InputCosUri must be selected.) 
     * @return InputBase64 Run input JSON. Base64 encoding is required. (Either InputBase64 or InputCosUri must be selected.)
     */
    public String getInputBase64() {
        return this.InputBase64;
    }

    /**
     * Set Run input JSON. Base64 encoding is required. (Either InputBase64 or InputCosUri must be selected.)
     * @param InputBase64 Run input JSON. Base64 encoding is required. (Either InputBase64 or InputCosUri must be selected.)
     */
    public void setInputBase64(String InputBase64) {
        this.InputBase64 = InputBase64;
    }

    /**
     * Get Batch deliver table ID. Leaving it blank indicates delivery in singleton mode. 
     * @return TableId Batch deliver table ID. Leaving it blank indicates delivery in singleton mode.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Batch deliver table ID. Leaving it blank indicates delivery in singleton mode.
     * @param TableId Batch deliver table ID. Leaving it blank indicates delivery in singleton mode.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Batch deliver table row UUID. Leaving it blank indicates all rows of the table. 
     * @return TableRowUuids Batch deliver table row UUID. Leaving it blank indicates all rows of the table.
     */
    public String [] getTableRowUuids() {
        return this.TableRowUuids;
    }

    /**
     * Set Batch deliver table row UUID. Leaving it blank indicates all rows of the table.
     * @param TableRowUuids Batch deliver table row UUID. Leaving it blank indicates all rows of the table.
     */
    public void setTableRowUuids(String [] TableRowUuids) {
        this.TableRowUuids = TableRowUuids;
    }

    /**
     * Get Run cache cleanup time (hours). Leaving it blank or entering 0 indicates no cleanup. 
     * @return CacheClearDelay Run cache cleanup time (hours). Leaving it blank or entering 0 indicates no cleanup.
     */
    public Long getCacheClearDelay() {
        return this.CacheClearDelay;
    }

    /**
     * Set Run cache cleanup time (hours). Leaving it blank or entering 0 indicates no cleanup.
     * @param CacheClearDelay Run cache cleanup time (hours). Leaving it blank or entering 0 indicates no cleanup.
     */
    public void setCacheClearDelay(Long CacheClearDelay) {
        this.CacheClearDelay = CacheClearDelay;
    }

    /**
     * Get Application version ID. Leaving it blank indicates that the latest version is used. 
     * @return ApplicationVersionId Application version ID. Leaving it blank indicates that the latest version is used.
     */
    public String getApplicationVersionId() {
        return this.ApplicationVersionId;
    }

    /**
     * Set Application version ID. Leaving it blank indicates that the latest version is used.
     * @param ApplicationVersionId Application version ID. Leaving it blank indicates that the latest version is used.
     */
    public void setApplicationVersionId(String ApplicationVersionId) {
        this.ApplicationVersionId = ApplicationVersionId;
    }

    /**
     * Get WDL running option 
     * @return Option WDL running option
     */
    public RunOption getOption() {
        return this.Option;
    }

    /**
     * Set WDL running option
     * @param Option WDL running option
     */
    public void setOption(RunOption Option) {
        this.Option = Option;
    }

    /**
     * Get Nextflow running option 
     * @return NFOption Nextflow running option
     */
    public NFOption getNFOption() {
        return this.NFOption;
    }

    /**
     * Set Nextflow running option
     * @param NFOption Nextflow running option
     */
    public void setNFOption(NFOption NFOption) {
        this.NFOption = NFOption;
    }

    /**
     * Get Working directory. You can fill in the absolute path in the specified volume. If you leave it blank, the default path in the default volume will be used. Currently, only Nextflow is supported. 
     * @return WorkDir Working directory. You can fill in the absolute path in the specified volume. If you leave it blank, the default path in the default volume will be used. Currently, only Nextflow is supported.
     */
    public String getWorkDir() {
        return this.WorkDir;
    }

    /**
     * Set Working directory. You can fill in the absolute path in the specified volume. If you leave it blank, the default path in the default volume will be used. Currently, only Nextflow is supported.
     * @param WorkDir Working directory. You can fill in the absolute path in the specified volume. If you leave it blank, the default path in the default volume will be used. Currently, only Nextflow is supported.
     */
    public void setWorkDir(String WorkDir) {
        this.WorkDir = WorkDir;
    }

    /**
     * Get Access mode. Leaving it blank indicates it is private by default. Valid values:
- PRIVATE: Private application
- PUBLIC: Public application 
     * @return AccessMode Access mode. Leaving it blank indicates it is private by default. Valid values:
- PRIVATE: Private application
- PUBLIC: Public application
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set Access mode. Leaving it blank indicates it is private by default. Valid values:
- PRIVATE: Private application
- PUBLIC: Public application
     * @param AccessMode Access mode. Leaving it blank indicates it is private by default. Valid values:
- PRIVATE: Private application
- PUBLIC: Public application
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get Volume ID. If you leave it blank, the default volume will be used. Currently, only Nextflow is supported. 
     * @return VolumeIds Volume ID. If you leave it blank, the default volume will be used. Currently, only Nextflow is supported.
     */
    public String [] getVolumeIds() {
        return this.VolumeIds;
    }

    /**
     * Set Volume ID. If you leave it blank, the default volume will be used. Currently, only Nextflow is supported.
     * @param VolumeIds Volume ID. If you leave it blank, the default volume will be used. Currently, only Nextflow is supported.
     */
    public void setVolumeIds(String [] VolumeIds) {
        this.VolumeIds = VolumeIds;
    }

    public RunApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunApplicationRequest(RunApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InputCosUri != null) {
            this.InputCosUri = new String(source.InputCosUri);
        }
        if (source.InputBase64 != null) {
            this.InputBase64 = new String(source.InputBase64);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableRowUuids != null) {
            this.TableRowUuids = new String[source.TableRowUuids.length];
            for (int i = 0; i < source.TableRowUuids.length; i++) {
                this.TableRowUuids[i] = new String(source.TableRowUuids[i]);
            }
        }
        if (source.CacheClearDelay != null) {
            this.CacheClearDelay = new Long(source.CacheClearDelay);
        }
        if (source.ApplicationVersionId != null) {
            this.ApplicationVersionId = new String(source.ApplicationVersionId);
        }
        if (source.Option != null) {
            this.Option = new RunOption(source.Option);
        }
        if (source.NFOption != null) {
            this.NFOption = new NFOption(source.NFOption);
        }
        if (source.WorkDir != null) {
            this.WorkDir = new String(source.WorkDir);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
        if (source.VolumeIds != null) {
            this.VolumeIds = new String[source.VolumeIds.length];
            for (int i = 0; i < source.VolumeIds.length; i++) {
                this.VolumeIds[i] = new String(source.VolumeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InputCosUri", this.InputCosUri);
        this.setParamSimple(map, prefix + "InputBase64", this.InputBase64);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamArraySimple(map, prefix + "TableRowUuids.", this.TableRowUuids);
        this.setParamSimple(map, prefix + "CacheClearDelay", this.CacheClearDelay);
        this.setParamSimple(map, prefix + "ApplicationVersionId", this.ApplicationVersionId);
        this.setParamObj(map, prefix + "Option.", this.Option);
        this.setParamObj(map, prefix + "NFOption.", this.NFOption);
        this.setParamSimple(map, prefix + "WorkDir", this.WorkDir);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamArraySimple(map, prefix + "VolumeIds.", this.VolumeIds);

    }
}

