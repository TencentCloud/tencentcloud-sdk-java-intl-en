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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMediaPackageChannelRequest extends AbstractModel{

    /**
    * Channel ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * The channel name after modification.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The channel protocol after modification. Valid values: HLS, DASH.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get Channel ID. 
     * @return Id Channel ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Channel ID.
     * @param Id Channel ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get The channel name after modification. 
     * @return Name The channel name after modification.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The channel name after modification.
     * @param Name The channel name after modification.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The channel protocol after modification. Valid values: HLS, DASH. 
     * @return Protocol The channel protocol after modification. Valid values: HLS, DASH.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The channel protocol after modification. Valid values: HLS, DASH.
     * @param Protocol The channel protocol after modification. Valid values: HLS, DASH.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public ModifyMediaPackageChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMediaPackageChannelRequest(ModifyMediaPackageChannelRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

