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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineGroupInfo extends AbstractModel {

    /**
    * Split zone group ID
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

    /**
    * Split zone group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Group type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * List of split zones in the split zone group
    */
    @SerializedName("LineList")
    @Expose
    private String [] LineList;

    /**
     * Get Split zone group ID 
     * @return LineId Split zone group ID
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set Split zone group ID
     * @param LineId Split zone group ID
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    /**
     * Get Split zone group name 
     * @return Name Split zone group name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Split zone group name
     * @param Name Split zone group name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Group type 
     * @return Type Group type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Group type
     * @param Type Group type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get List of split zones in the split zone group 
     * @return LineList List of split zones in the split zone group
     */
    public String [] getLineList() {
        return this.LineList;
    }

    /**
     * Set List of split zones in the split zone group
     * @param LineList List of split zones in the split zone group
     */
    public void setLineList(String [] LineList) {
        this.LineList = LineList;
    }

    public LineGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineGroupInfo(LineGroupInfo source) {
        if (source.LineId != null) {
            this.LineId = new String(source.LineId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.LineList != null) {
            this.LineList = new String[source.LineList.length];
            for (int i = 0; i < source.LineList.length; i++) {
                this.LineList[i] = new String(source.LineList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LineId", this.LineId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "LineList.", this.LineList);

    }
}

