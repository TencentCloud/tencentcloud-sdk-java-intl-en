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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourcePackageConf extends AbstractModel {

    /**
    * Group name. When the channel is in Linear mode and vod source is selected, the group name corresponds to the output group name of the channel output.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Type, distinguish between HLS and DASH, optional values: HLS, DASH.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * access path.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get Group name. When the channel is in Linear mode and vod source is selected, the group name corresponds to the output group name of the channel output. 
     * @return GroupName Group name. When the channel is in Linear mode and vod source is selected, the group name corresponds to the output group name of the channel output.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Group name. When the channel is in Linear mode and vod source is selected, the group name corresponds to the output group name of the channel output.
     * @param GroupName Group name. When the channel is in Linear mode and vod source is selected, the group name corresponds to the output group name of the channel output.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Type, distinguish between HLS and DASH, optional values: HLS, DASH. 
     * @return Type Type, distinguish between HLS and DASH, optional values: HLS, DASH.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type, distinguish between HLS and DASH, optional values: HLS, DASH.
     * @param Type Type, distinguish between HLS and DASH, optional values: HLS, DASH.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get access path. 
     * @return Path access path.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set access path.
     * @param Path access path.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public SourcePackageConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourcePackageConf(SourcePackageConf source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

