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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JoinRelation extends AbstractModel {

    /**
    * Association relationship id, used by the frontend
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JoinId")
    @Expose
    private String JoinId;

    /**
    * Original table node id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceTableNodeId")
    @Expose
    private String SourceTableNodeId;

    /**
    * Target table node id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetTableNodeId")
    @Expose
    private String TargetTableNodeId;

    /**
    * Association type of multi-table join
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

    /**
    * Field list for joined tables
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fields")
    @Expose
    private JoinRelationField [] Fields;

    /**
     * Get Association relationship id, used by the frontend
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JoinId Association relationship id, used by the frontend
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJoinId() {
        return this.JoinId;
    }

    /**
     * Set Association relationship id, used by the frontend
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JoinId Association relationship id, used by the frontend
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJoinId(String JoinId) {
        this.JoinId = JoinId;
    }

    /**
     * Get Original table node id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceTableNodeId Original table node id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceTableNodeId() {
        return this.SourceTableNodeId;
    }

    /**
     * Set Original table node id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceTableNodeId Original table node id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceTableNodeId(String SourceTableNodeId) {
        this.SourceTableNodeId = SourceTableNodeId;
    }

    /**
     * Get Target table node id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetTableNodeId Target table node id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetTableNodeId() {
        return this.TargetTableNodeId;
    }

    /**
     * Set Target table node id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetTableNodeId Target table node id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetTableNodeId(String TargetTableNodeId) {
        this.TargetTableNodeId = TargetTableNodeId;
    }

    /**
     * Get Association type of multi-table join
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JoinType Association type of multi-table join
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJoinType() {
        return this.JoinType;
    }

    /**
     * Set Association type of multi-table join
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JoinType Association type of multi-table join
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJoinType(String JoinType) {
        this.JoinType = JoinType;
    }

    /**
     * Get Field list for joined tables
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Fields Field list for joined tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public JoinRelationField [] getFields() {
        return this.Fields;
    }

    /**
     * Set Field list for joined tables
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Fields Field list for joined tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFields(JoinRelationField [] Fields) {
        this.Fields = Fields;
    }

    public JoinRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinRelation(JoinRelation source) {
        if (source.JoinId != null) {
            this.JoinId = new String(source.JoinId);
        }
        if (source.SourceTableNodeId != null) {
            this.SourceTableNodeId = new String(source.SourceTableNodeId);
        }
        if (source.TargetTableNodeId != null) {
            this.TargetTableNodeId = new String(source.TargetTableNodeId);
        }
        if (source.JoinType != null) {
            this.JoinType = new String(source.JoinType);
        }
        if (source.Fields != null) {
            this.Fields = new JoinRelationField[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new JoinRelationField(source.Fields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JoinId", this.JoinId);
        this.setParamSimple(map, prefix + "SourceTableNodeId", this.SourceTableNodeId);
        this.setParamSimple(map, prefix + "TargetTableNodeId", this.TargetTableNodeId);
        this.setParamSimple(map, prefix + "JoinType", this.JoinType);
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);

    }
}

