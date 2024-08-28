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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetCoreModuleDetail extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Dependent processes
    */
    @SerializedName("Processes")
    @Expose
    private String Processes;

    /**
    * Dependent modules
    */
    @SerializedName("Modules")
    @Expose
    private String Modules;

    /**
    * Parameter information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Params")
    @Expose
    private AssetCoreModuleParam [] Params;

    /**
    * Data update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description 
     * @return Desc Description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description
     * @param Desc Description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Path 
     * @return Path Path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path
     * @param Path Path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Version 
     * @return Version Version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version
     * @param Version Version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Size 
     * @return Size Size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Size
     * @param Size Size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Dependent processes 
     * @return Processes Dependent processes
     */
    public String getProcesses() {
        return this.Processes;
    }

    /**
     * Set Dependent processes
     * @param Processes Dependent processes
     */
    public void setProcesses(String Processes) {
        this.Processes = Processes;
    }

    /**
     * Get Dependent modules 
     * @return Modules Dependent modules
     */
    public String getModules() {
        return this.Modules;
    }

    /**
     * Set Dependent modules
     * @param Modules Dependent modules
     */
    public void setModules(String Modules) {
        this.Modules = Modules;
    }

    /**
     * Get Parameter information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Params Parameter information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AssetCoreModuleParam [] getParams() {
        return this.Params;
    }

    /**
     * Set Parameter information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Params Parameter information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParams(AssetCoreModuleParam [] Params) {
        this.Params = Params;
    }

    /**
     * Get Data update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AssetCoreModuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetCoreModuleDetail(AssetCoreModuleDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Processes != null) {
            this.Processes = new String(source.Processes);
        }
        if (source.Modules != null) {
            this.Modules = new String(source.Modules);
        }
        if (source.Params != null) {
            this.Params = new AssetCoreModuleParam[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new AssetCoreModuleParam(source.Params[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Processes", this.Processes);
        this.setParamSimple(map, prefix + "Modules", this.Modules);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

