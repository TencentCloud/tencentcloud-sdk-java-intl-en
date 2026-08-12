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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostVulComponent extends AbstractModel {

    /**
    * <p>Host brief information</p>
    */
    @SerializedName("HostInfo")
    @Expose
    private HostBriefInfo HostInfo;

    /**
    * <p>Affected component version</p>
    */
    @SerializedName("EffectVersion")
    @Expose
    private String EffectVersion;

    /**
    * <p>Installation path of the component on the host</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Associated process ID.</p>
    */
    @SerializedName("ProcessID")
    @Expose
    private String ProcessID;

    /**
    * <p>Fix Command (only display)</p>
    */
    @SerializedName("FixCommand")
    @Expose
    private String FixCommand;

    /**
    * <p>Component name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>Host brief information</p> 
     * @return HostInfo <p>Host brief information</p>
     */
    public HostBriefInfo getHostInfo() {
        return this.HostInfo;
    }

    /**
     * Set <p>Host brief information</p>
     * @param HostInfo <p>Host brief information</p>
     */
    public void setHostInfo(HostBriefInfo HostInfo) {
        this.HostInfo = HostInfo;
    }

    /**
     * Get <p>Affected component version</p> 
     * @return EffectVersion <p>Affected component version</p>
     */
    public String getEffectVersion() {
        return this.EffectVersion;
    }

    /**
     * Set <p>Affected component version</p>
     * @param EffectVersion <p>Affected component version</p>
     */
    public void setEffectVersion(String EffectVersion) {
        this.EffectVersion = EffectVersion;
    }

    /**
     * Get <p>Installation path of the component on the host</p> 
     * @return Path <p>Installation path of the component on the host</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Installation path of the component on the host</p>
     * @param Path <p>Installation path of the component on the host</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Associated process ID.</p> 
     * @return ProcessID <p>Associated process ID.</p>
     */
    public String getProcessID() {
        return this.ProcessID;
    }

    /**
     * Set <p>Associated process ID.</p>
     * @param ProcessID <p>Associated process ID.</p>
     */
    public void setProcessID(String ProcessID) {
        this.ProcessID = ProcessID;
    }

    /**
     * Get <p>Fix Command (only display)</p> 
     * @return FixCommand <p>Fix Command (only display)</p>
     */
    public String getFixCommand() {
        return this.FixCommand;
    }

    /**
     * Set <p>Fix Command (only display)</p>
     * @param FixCommand <p>Fix Command (only display)</p>
     */
    public void setFixCommand(String FixCommand) {
        this.FixCommand = FixCommand;
    }

    /**
     * Get <p>Component name.</p> 
     * @return Name <p>Component name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Component name.</p>
     * @param Name <p>Component name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public HostVulComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostVulComponent(HostVulComponent source) {
        if (source.HostInfo != null) {
            this.HostInfo = new HostBriefInfo(source.HostInfo);
        }
        if (source.EffectVersion != null) {
            this.EffectVersion = new String(source.EffectVersion);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.ProcessID != null) {
            this.ProcessID = new String(source.ProcessID);
        }
        if (source.FixCommand != null) {
            this.FixCommand = new String(source.FixCommand);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HostInfo.", this.HostInfo);
        this.setParamSimple(map, prefix + "EffectVersion", this.EffectVersion);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "ProcessID", this.ProcessID);
        this.setParamSimple(map, prefix + "FixCommand", this.FixCommand);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

