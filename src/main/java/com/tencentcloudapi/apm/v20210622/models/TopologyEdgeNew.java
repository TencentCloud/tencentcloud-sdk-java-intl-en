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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopologyEdgeNew extends AbstractModel {

    /**
    * Source node
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Edge ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Edge weight
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Float Weight;

    /**
    * Target node
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * response time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Error rate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrRate")
    @Expose
    private Float ErrRate;

    /**
    * throughput
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Qps")
    @Expose
    private Float Qps;

    /**
    * Edge type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Edge color
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * SQL call count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SqlRequestCount")
    @Expose
    private Float SqlRequestCount;

    /**
    * SQL call error count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SqlErrorRequestCount")
    @Expose
    private Float SqlErrorRequestCount;

    /**
    * Source node type on the edge of the topology diagram. Application/MQ/DB.
    */
    @SerializedName("SourceComp")
    @Expose
    private String SourceComp;

    /**
    * Target node type on the edge of the topology diagram. Application/MQ/DB.
    */
    @SerializedName("TargetComp")
    @Expose
    private String TargetComp;

    /**
     * Get Source node 
     * @return Source Source node
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Source node
     * @param Source Source node
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Edge ID 
     * @return Id Edge ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Edge ID
     * @param Id Edge ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Edge weight
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weight Edge weight
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getWeight() {
        return this.Weight;
    }

    /**
     * Set Edge weight
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weight Edge weight
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Target node 
     * @return Target Target node
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Target node
     * @param Target Target node
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get response time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Duration response time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set response time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Duration response time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Error rate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrRate Error rate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getErrRate() {
        return this.ErrRate;
    }

    /**
     * Set Error rate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrRate Error rate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrRate(Float ErrRate) {
        this.ErrRate = ErrRate;
    }

    /**
     * Get throughput
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Qps throughput
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getQps() {
        return this.Qps;
    }

    /**
     * Set throughput
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Qps throughput
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQps(Float Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Edge type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Edge type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Edge type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Edge type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Edge color
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Color Edge color
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set Edge color
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Color Edge color
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get SQL call count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SqlRequestCount SQL call count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getSqlRequestCount() {
        return this.SqlRequestCount;
    }

    /**
     * Set SQL call count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SqlRequestCount SQL call count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSqlRequestCount(Float SqlRequestCount) {
        this.SqlRequestCount = SqlRequestCount;
    }

    /**
     * Get SQL call error count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SqlErrorRequestCount SQL call error count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getSqlErrorRequestCount() {
        return this.SqlErrorRequestCount;
    }

    /**
     * Set SQL call error count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SqlErrorRequestCount SQL call error count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSqlErrorRequestCount(Float SqlErrorRequestCount) {
        this.SqlErrorRequestCount = SqlErrorRequestCount;
    }

    /**
     * Get Source node type on the edge of the topology diagram. Application/MQ/DB. 
     * @return SourceComp Source node type on the edge of the topology diagram. Application/MQ/DB.
     */
    public String getSourceComp() {
        return this.SourceComp;
    }

    /**
     * Set Source node type on the edge of the topology diagram. Application/MQ/DB.
     * @param SourceComp Source node type on the edge of the topology diagram. Application/MQ/DB.
     */
    public void setSourceComp(String SourceComp) {
        this.SourceComp = SourceComp;
    }

    /**
     * Get Target node type on the edge of the topology diagram. Application/MQ/DB. 
     * @return TargetComp Target node type on the edge of the topology diagram. Application/MQ/DB.
     */
    public String getTargetComp() {
        return this.TargetComp;
    }

    /**
     * Set Target node type on the edge of the topology diagram. Application/MQ/DB.
     * @param TargetComp Target node type on the edge of the topology diagram. Application/MQ/DB.
     */
    public void setTargetComp(String TargetComp) {
        this.TargetComp = TargetComp;
    }

    public TopologyEdgeNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopologyEdgeNew(TopologyEdgeNew source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Weight != null) {
            this.Weight = new Float(source.Weight);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.ErrRate != null) {
            this.ErrRate = new Float(source.ErrRate);
        }
        if (source.Qps != null) {
            this.Qps = new Float(source.Qps);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.SqlRequestCount != null) {
            this.SqlRequestCount = new Float(source.SqlRequestCount);
        }
        if (source.SqlErrorRequestCount != null) {
            this.SqlErrorRequestCount = new Float(source.SqlErrorRequestCount);
        }
        if (source.SourceComp != null) {
            this.SourceComp = new String(source.SourceComp);
        }
        if (source.TargetComp != null) {
            this.TargetComp = new String(source.TargetComp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ErrRate", this.ErrRate);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "SqlRequestCount", this.SqlRequestCount);
        this.setParamSimple(map, prefix + "SqlErrorRequestCount", this.SqlErrorRequestCount);
        this.setParamSimple(map, prefix + "SourceComp", this.SourceComp);
        this.setParamSimple(map, prefix + "TargetComp", this.TargetComp);

    }
}

