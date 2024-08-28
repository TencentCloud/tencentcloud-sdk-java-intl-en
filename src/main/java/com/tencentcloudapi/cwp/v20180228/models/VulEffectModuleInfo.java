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

public class VulEffectModuleInfo extends AbstractModel {

    /**
    * Component name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Affected host uuid
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * Affected component version
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * Component path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Component version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Fix Command
    */
    @SerializedName("FixCmd")
    @Expose
    private String FixCmd;

    /**
    * Affected host quuid
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
     * Get Component name 
     * @return Name Component name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Component name
     * @param Name Component name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Affected host uuid 
     * @return Uuids Affected host uuid
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set Affected host uuid
     * @param Uuids Affected host uuid
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get Affected component version 
     * @return Rule Affected component version
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set Affected component version
     * @param Rule Affected component version
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Component path 
     * @return Path Component path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Component path
     * @param Path Component path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Component version 
     * @return Version Component version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Component version
     * @param Version Component version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Fix Command 
     * @return FixCmd Fix Command
     */
    public String getFixCmd() {
        return this.FixCmd;
    }

    /**
     * Set Fix Command
     * @param FixCmd Fix Command
     */
    public void setFixCmd(String FixCmd) {
        this.FixCmd = FixCmd;
    }

    /**
     * Get Affected host quuid 
     * @return Quuids Affected host quuid
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set Affected host quuid
     * @param Quuids Affected host quuid
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    public VulEffectModuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulEffectModuleInfo(VulEffectModuleInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.FixCmd != null) {
            this.FixCmd = new String(source.FixCmd);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "FixCmd", this.FixCmd);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);

    }
}

