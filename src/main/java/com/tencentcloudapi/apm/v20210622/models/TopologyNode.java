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

public class TopologyNode extends AbstractModel {

    /**
    * Error rate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrRate")
    @Expose
    private Float ErrRate;

    /**
    * Node type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Node name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Node weight
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Float Weight;

    /**
    * Node color
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * response time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * throughput
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Qps")
    @Expose
    private Float Qps;

    /**
    * Node type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Node ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Node size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * Indicate whether the node is a component
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsModule")
    @Expose
    private Boolean IsModule;

    /**
    * Node location information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Position")
    @Expose
    private Position Position;

    /**
    * Node tags
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * Whether the node supports drill-down.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CanDrillDown")
    @Expose
    private Boolean CanDrillDown;

    /**
    * Resource layer information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * Name of the topology node view.
    */
    @SerializedName("NodeView")
    @Expose
    private String NodeView;

    /**
    * Message consumption time of the MQ consumer, in ms.
    */
    @SerializedName("ConsumerDuration")
    @Expose
    private Float ConsumerDuration;

    /**
    * Error rate of the MQ consumers, in %.
    */
    @SerializedName("ConsumerErrRate")
    @Expose
    private Float ConsumerErrRate;

    /**
    * Throughput of the message queue (MQ) consumer.
    */
    @SerializedName("ConsumerQps")
    @Expose
    private Float ConsumerQps;

    /**
    * Application ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

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
     * Get Node type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Kind Node type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Node type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Kind Node type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Node name 
     * @return Name Node name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Node name
     * @param Name Node name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Node weight
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weight Node weight
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getWeight() {
        return this.Weight;
    }

    /**
     * Set Node weight
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weight Node weight
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Node color
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Color Node color
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set Node color
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Color Node color
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColor(String Color) {
        this.Color = Color;
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
     * Get Node type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Node type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Node type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Node type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Node ID 
     * @return Id Node ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Node ID
     * @param Id Node ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Node size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Size Node size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set Node size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Size Node size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get Indicate whether the node is a component
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsModule Indicate whether the node is a component
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsModule() {
        return this.IsModule;
    }

    /**
     * Set Indicate whether the node is a component
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsModule Indicate whether the node is a component
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsModule(Boolean IsModule) {
        this.IsModule = IsModule;
    }

    /**
     * Get Node location information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Position Node location information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Position getPosition() {
        return this.Position;
    }

    /**
     * Set Node location information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Position Node location information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPosition(Position Position) {
        this.Position = Position;
    }

    /**
     * Get Node tags
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Node tags
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Node tags
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Node tags
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether the node supports drill-down.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CanDrillDown Whether the node supports drill-down.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCanDrillDown() {
        return this.CanDrillDown;
    }

    /**
     * Set Whether the node supports drill-down.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CanDrillDown Whether the node supports drill-down.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCanDrillDown(Boolean CanDrillDown) {
        this.CanDrillDown = CanDrillDown;
    }

    /**
     * Get Resource layer information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resource Resource layer information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set Resource layer information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resource Resource layer information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Name of the topology node view. 
     * @return NodeView Name of the topology node view.
     */
    public String getNodeView() {
        return this.NodeView;
    }

    /**
     * Set Name of the topology node view.
     * @param NodeView Name of the topology node view.
     */
    public void setNodeView(String NodeView) {
        this.NodeView = NodeView;
    }

    /**
     * Get Message consumption time of the MQ consumer, in ms. 
     * @return ConsumerDuration Message consumption time of the MQ consumer, in ms.
     */
    public Float getConsumerDuration() {
        return this.ConsumerDuration;
    }

    /**
     * Set Message consumption time of the MQ consumer, in ms.
     * @param ConsumerDuration Message consumption time of the MQ consumer, in ms.
     */
    public void setConsumerDuration(Float ConsumerDuration) {
        this.ConsumerDuration = ConsumerDuration;
    }

    /**
     * Get Error rate of the MQ consumers, in %. 
     * @return ConsumerErrRate Error rate of the MQ consumers, in %.
     */
    public Float getConsumerErrRate() {
        return this.ConsumerErrRate;
    }

    /**
     * Set Error rate of the MQ consumers, in %.
     * @param ConsumerErrRate Error rate of the MQ consumers, in %.
     */
    public void setConsumerErrRate(Float ConsumerErrRate) {
        this.ConsumerErrRate = ConsumerErrRate;
    }

    /**
     * Get Throughput of the message queue (MQ) consumer. 
     * @return ConsumerQps Throughput of the message queue (MQ) consumer.
     */
    public Float getConsumerQps() {
        return this.ConsumerQps;
    }

    /**
     * Set Throughput of the message queue (MQ) consumer.
     * @param ConsumerQps Throughput of the message queue (MQ) consumer.
     */
    public void setConsumerQps(Float ConsumerQps) {
        this.ConsumerQps = ConsumerQps;
    }

    /**
     * Get Application ID. 
     * @return ServiceId Application ID.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Application ID.
     * @param ServiceId Application ID.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public TopologyNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopologyNode(TopologyNode source) {
        if (source.ErrRate != null) {
            this.ErrRate = new Float(source.ErrRate);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Weight != null) {
            this.Weight = new Float(source.Weight);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Qps != null) {
            this.Qps = new Float(source.Qps);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.IsModule != null) {
            this.IsModule = new Boolean(source.IsModule);
        }
        if (source.Position != null) {
            this.Position = new Position(source.Position);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.CanDrillDown != null) {
            this.CanDrillDown = new Boolean(source.CanDrillDown);
        }
        if (source.Resource != null) {
            this.Resource = new Resource(source.Resource);
        }
        if (source.NodeView != null) {
            this.NodeView = new String(source.NodeView);
        }
        if (source.ConsumerDuration != null) {
            this.ConsumerDuration = new Float(source.ConsumerDuration);
        }
        if (source.ConsumerErrRate != null) {
            this.ConsumerErrRate = new Float(source.ConsumerErrRate);
        }
        if (source.ConsumerQps != null) {
            this.ConsumerQps = new Float(source.ConsumerQps);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrRate", this.ErrRate);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "IsModule", this.IsModule);
        this.setParamObj(map, prefix + "Position.", this.Position);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CanDrillDown", this.CanDrillDown);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "NodeView", this.NodeView);
        this.setParamSimple(map, prefix + "ConsumerDuration", this.ConsumerDuration);
        this.setParamSimple(map, prefix + "ConsumerErrRate", this.ConsumerErrRate);
        this.setParamSimple(map, prefix + "ConsumerQps", this.ConsumerQps);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}

