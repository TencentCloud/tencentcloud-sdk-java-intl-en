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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricCollectConfig extends AbstractModel {

    /**
    * Collection configuration ID.
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Log topic ID.
    */
    @SerializedName("TopicIds")
    @Expose
    private String [] TopicIds;

    /**
    * Collection configuration source. Support: `0`, `1`.
-0: Self-build k8s
- 1:TKE
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * Machine group ID.
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * Monitoring type. Supported values: `0`, `1`. Cannot be modified.

-0: Basic monitoring
-Custom monitoring
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Collection configuration method. Supports `0` and `1`. Cannot be modified.
-0: Ordinary setting method. The Type field is only for: `1`
-YAML import method, Type can be `0` or `1`.
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * Name: Length not exceeding 253 characters, check format `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Collection object. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Spec")
    @Expose
    private MetricSpec Spec;

    /**
    * Label processing. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricRelabels")
    @Expose
    private Relabeling [] MetricRelabels;

    /**
    * Custom metadata. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricLabel")
    @Expose
    private MetricConfigLabel MetricLabel;

    /**
    * Communication protocol. Valid values: HTTP and HTTPS. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Collection frequency. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScrapeInterval")
    @Expose
    private String ScrapeInterval;

    /**
    * Collection timeout. This parameter is valid only when Flag=0 && Type=1.
- format:`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScrapeTimeout")
    @Expose
    private String ScrapeTimeout;

    /**
    * How Prometheus handles tag conflicts. When Flag=0 takes effect, `true` and `false` are supported.

- `false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HonorLabels")
    @Expose
    private Boolean HonorLabels;

    /**
    * Collection configuration, which is a string in YAML format. It is required when Flag is 1.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("YamlSpec")
    @Expose
    private MetricYamlSpec YamlSpec;

    /**
    * Operation status. Valid values: 0: applied; 1: paused.
    */
    @SerializedName("Operate")
    @Expose
    private Long Operate;

    /**
    * Creation time (a second-level timestamp).
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Update timestamp (second-level).
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Collection configuration ID. 
     * @return ConfigId Collection configuration ID.
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Collection configuration ID.
     * @param ConfigId Collection configuration ID.
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Log topic ID. 
     * @return TopicIds Log topic ID.
     */
    public String [] getTopicIds() {
        return this.TopicIds;
    }

    /**
     * Set Log topic ID.
     * @param TopicIds Log topic ID.
     */
    public void setTopicIds(String [] TopicIds) {
        this.TopicIds = TopicIds;
    }

    /**
     * Get Collection configuration source. Support: `0`, `1`.
-0: Self-build k8s
- 1:TKE 
     * @return Source Collection configuration source. Support: `0`, `1`.
-0: Self-build k8s
- 1:TKE
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set Collection configuration source. Support: `0`, `1`.
-0: Self-build k8s
- 1:TKE
     * @param Source Collection configuration source. Support: `0`, `1`.
-0: Self-build k8s
- 1:TKE
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get Machine group ID. 
     * @return GroupIds Machine group ID.
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set Machine group ID.
     * @param GroupIds Machine group ID.
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get Monitoring type. Supported values: `0`, `1`. Cannot be modified.

-0: Basic monitoring
-Custom monitoring 
     * @return Type Monitoring type. Supported values: `0`, `1`. Cannot be modified.

-0: Basic monitoring
-Custom monitoring
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Monitoring type. Supported values: `0`, `1`. Cannot be modified.

-0: Basic monitoring
-Custom monitoring
     * @param Type Monitoring type. Supported values: `0`, `1`. Cannot be modified.

-0: Basic monitoring
-Custom monitoring
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Collection configuration method. Supports `0` and `1`. Cannot be modified.
-0: Ordinary setting method. The Type field is only for: `1`
-YAML import method, Type can be `0` or `1`. 
     * @return Flag Collection configuration method. Supports `0` and `1`. Cannot be modified.
-0: Ordinary setting method. The Type field is only for: `1`
-YAML import method, Type can be `0` or `1`.
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set Collection configuration method. Supports `0` and `1`. Cannot be modified.
-0: Ordinary setting method. The Type field is only for: `1`
-YAML import method, Type can be `0` or `1`.
     * @param Flag Collection configuration method. Supports `0` and `1`. Cannot be modified.
-0: Ordinary setting method. The Type field is only for: `1`
-YAML import method, Type can be `0` or `1`.
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get Name: Length not exceeding 253 characters, check format `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Name: Length not exceeding 253 characters, check format `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name: Length not exceeding 253 characters, check format `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Name: Length not exceeding 253 characters, check format `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Collection object. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Spec Collection object. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MetricSpec getSpec() {
        return this.Spec;
    }

    /**
     * Set Collection object. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Spec Collection object. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpec(MetricSpec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Label processing. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetricRelabels Label processing. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Relabeling [] getMetricRelabels() {
        return this.MetricRelabels;
    }

    /**
     * Set Label processing. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetricRelabels Label processing. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricRelabels(Relabeling [] MetricRelabels) {
        this.MetricRelabels = MetricRelabels;
    }

    /**
     * Get Custom metadata. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetricLabel Custom metadata. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MetricConfigLabel getMetricLabel() {
        return this.MetricLabel;
    }

    /**
     * Set Custom metadata. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetricLabel Custom metadata. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricLabel(MetricConfigLabel MetricLabel) {
        this.MetricLabel = MetricLabel;
    }

    /**
     * Get Communication protocol. Valid values: HTTP and HTTPS. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Scheme Communication protocol. Valid values: HTTP and HTTPS. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Communication protocol. Valid values: HTTP and HTTPS. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Scheme Communication protocol. Valid values: HTTP and HTTPS. This parameter is valid only when Flag is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Collection frequency. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScrapeInterval Collection frequency. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScrapeInterval() {
        return this.ScrapeInterval;
    }

    /**
     * Set Collection frequency. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScrapeInterval Collection frequency. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScrapeInterval(String ScrapeInterval) {
        this.ScrapeInterval = ScrapeInterval;
    }

    /**
     * Get Collection timeout. This parameter is valid only when Flag=0 && Type=1.
- format:`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScrapeTimeout Collection timeout. This parameter is valid only when Flag=0 && Type=1.
- format:`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScrapeTimeout() {
        return this.ScrapeTimeout;
    }

    /**
     * Set Collection timeout. This parameter is valid only when Flag=0 && Type=1.
- format:`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScrapeTimeout Collection timeout. This parameter is valid only when Flag=0 && Type=1.
- format:`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScrapeTimeout(String ScrapeTimeout) {
        this.ScrapeTimeout = ScrapeTimeout;
    }

    /**
     * Get How Prometheus handles tag conflicts. When Flag=0 takes effect, `true` and `false` are supported.

- `false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HonorLabels How Prometheus handles tag conflicts. When Flag=0 takes effect, `true` and `false` are supported.

- `false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getHonorLabels() {
        return this.HonorLabels;
    }

    /**
     * Set How Prometheus handles tag conflicts. When Flag=0 takes effect, `true` and `false` are supported.

- `false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HonorLabels How Prometheus handles tag conflicts. When Flag=0 takes effect, `true` and `false` are supported.

- `false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHonorLabels(Boolean HonorLabels) {
        this.HonorLabels = HonorLabels;
    }

    /**
     * Get Collection configuration, which is a string in YAML format. It is required when Flag is 1.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return YamlSpec Collection configuration, which is a string in YAML format. It is required when Flag is 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MetricYamlSpec getYamlSpec() {
        return this.YamlSpec;
    }

    /**
     * Set Collection configuration, which is a string in YAML format. It is required when Flag is 1.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param YamlSpec Collection configuration, which is a string in YAML format. It is required when Flag is 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setYamlSpec(MetricYamlSpec YamlSpec) {
        this.YamlSpec = YamlSpec;
    }

    /**
     * Get Operation status. Valid values: 0: applied; 1: paused. 
     * @return Operate Operation status. Valid values: 0: applied; 1: paused.
     */
    public Long getOperate() {
        return this.Operate;
    }

    /**
     * Set Operation status. Valid values: 0: applied; 1: paused.
     * @param Operate Operation status. Valid values: 0: applied; 1: paused.
     */
    public void setOperate(Long Operate) {
        this.Operate = Operate;
    }

    /**
     * Get Creation time (a second-level timestamp). 
     * @return CreateTime Creation time (a second-level timestamp).
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time (a second-level timestamp).
     * @param CreateTime Creation time (a second-level timestamp).
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update timestamp (second-level). 
     * @return UpdateTime Update timestamp (second-level).
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update timestamp (second-level).
     * @param UpdateTime Update timestamp (second-level).
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public MetricCollectConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricCollectConfig(MetricCollectConfig source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.TopicIds != null) {
            this.TopicIds = new String[source.TopicIds.length];
            for (int i = 0; i < source.TopicIds.length; i++) {
                this.TopicIds[i] = new String(source.TopicIds[i]);
            }
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Spec != null) {
            this.Spec = new MetricSpec(source.Spec);
        }
        if (source.MetricRelabels != null) {
            this.MetricRelabels = new Relabeling[source.MetricRelabels.length];
            for (int i = 0; i < source.MetricRelabels.length; i++) {
                this.MetricRelabels[i] = new Relabeling(source.MetricRelabels[i]);
            }
        }
        if (source.MetricLabel != null) {
            this.MetricLabel = new MetricConfigLabel(source.MetricLabel);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.ScrapeInterval != null) {
            this.ScrapeInterval = new String(source.ScrapeInterval);
        }
        if (source.ScrapeTimeout != null) {
            this.ScrapeTimeout = new String(source.ScrapeTimeout);
        }
        if (source.HonorLabels != null) {
            this.HonorLabels = new Boolean(source.HonorLabels);
        }
        if (source.YamlSpec != null) {
            this.YamlSpec = new MetricYamlSpec(source.YamlSpec);
        }
        if (source.Operate != null) {
            this.Operate = new Long(source.Operate);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamArraySimple(map, prefix + "TopicIds.", this.TopicIds);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Spec.", this.Spec);
        this.setParamArrayObj(map, prefix + "MetricRelabels.", this.MetricRelabels);
        this.setParamObj(map, prefix + "MetricLabel.", this.MetricLabel);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "ScrapeInterval", this.ScrapeInterval);
        this.setParamSimple(map, prefix + "ScrapeTimeout", this.ScrapeTimeout);
        this.setParamSimple(map, prefix + "HonorLabels", this.HonorLabels);
        this.setParamObj(map, prefix + "YamlSpec.", this.YamlSpec);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

