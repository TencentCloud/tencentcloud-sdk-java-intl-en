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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordsSpeed extends AbstractModel {

    /**
    * Node TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Node nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Speed value list
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Values")
    @Expose
    private SpeedValue [] Values;

    /**
     * Get Node TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return NodeType Node TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param NodeType Node TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Node nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return NodeName Node nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param NodeName Node nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Speed value list
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Values Speed value list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SpeedValue [] getValues() {
        return this.Values;
    }

    /**
     * Set Speed value list
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Values Speed value list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setValues(SpeedValue [] Values) {
        this.Values = Values;
    }

    public RecordsSpeed() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordsSpeed(RecordsSpeed source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Values != null) {
            this.Values = new SpeedValue[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new SpeedValue(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamArrayObj(map, prefix + "Values.", this.Values);

    }
}

