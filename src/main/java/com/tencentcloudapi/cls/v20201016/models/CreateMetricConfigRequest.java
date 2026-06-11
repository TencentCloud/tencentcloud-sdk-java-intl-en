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

public class CreateMetricConfigRequest extends AbstractModel {

    /**
    * Metric log topic id.
- Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

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
    * Collection configuration method. Supports `0`, `1`. Cannot be modified.
-0: Ordinary setting method. The Type field is only for `1`.
-YAML import method. Type can be `0` or `1`.
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * Name: Length not exceeding 253 characters, check format `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Collection object. This parameter is valid only when Flag is 0.
    */
    @SerializedName("Spec")
    @Expose
    private MetricSpec Spec;

    /**
    * Label processing. This parameter is valid only when Flag is 0.
    */
    @SerializedName("MetricRelabels")
    @Expose
    private Relabeling [] MetricRelabels;

    /**
    * Custom metadata. This parameter is valid only when Flag is 0.
    */
    @SerializedName("MetricLabel")
    @Expose
    private MetricConfigLabel MetricLabel;

    /**
    * Communication protocol. Valid values: HTTP and HTTPS. This parameter is valid only when Flag is 0.
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Collection frequency. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 60s
    */
    @SerializedName("ScrapeInterval")
    @Expose
    private String ScrapeInterval;

    /**
    * Collection timeout. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 30s
    */
    @SerializedName("ScrapeTimeout")
    @Expose
    private String ScrapeTimeout;

    /**
    * How to handle tag conflicts. This parameter is valid only when Flag=0 and supports `true` and `false`.
-`false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts
    */
    @SerializedName("HonorLabels")
    @Expose
    private Boolean HonorLabels;

    /**
    * Collection configuration, which is a string in YAML format. It is required when Flag is 1.
    */
    @SerializedName("YamlSpec")
    @Expose
    private MetricYamlSpec YamlSpec;

    /**
     * Get Metric log topic id.
- Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic. 
     * @return TopicId Metric log topic id.
- Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Metric log topic id.
- Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
     * @param TopicId Metric log topic id.
- Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
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
     * Get Collection configuration method. Supports `0`, `1`. Cannot be modified.
-0: Ordinary setting method. The Type field is only for `1`.
-YAML import method. Type can be `0` or `1`. 
     * @return Flag Collection configuration method. Supports `0`, `1`. Cannot be modified.
-0: Ordinary setting method. The Type field is only for `1`.
-YAML import method. Type can be `0` or `1`.
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set Collection configuration method. Supports `0`, `1`. Cannot be modified.
-0: Ordinary setting method. The Type field is only for `1`.
-YAML import method. Type can be `0` or `1`.
     * @param Flag Collection configuration method. Supports `0`, `1`. Cannot be modified.
-0: Ordinary setting method. The Type field is only for `1`.
-YAML import method. Type can be `0` or `1`.
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get Name: Length not exceeding 253 characters, check format `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`. 
     * @return Name Name: Length not exceeding 253 characters, check format `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name: Length not exceeding 253 characters, check format `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`.
     * @param Name Name: Length not exceeding 253 characters, check format `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Collection object. This parameter is valid only when Flag is 0. 
     * @return Spec Collection object. This parameter is valid only when Flag is 0.
     */
    public MetricSpec getSpec() {
        return this.Spec;
    }

    /**
     * Set Collection object. This parameter is valid only when Flag is 0.
     * @param Spec Collection object. This parameter is valid only when Flag is 0.
     */
    public void setSpec(MetricSpec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Label processing. This parameter is valid only when Flag is 0. 
     * @return MetricRelabels Label processing. This parameter is valid only when Flag is 0.
     */
    public Relabeling [] getMetricRelabels() {
        return this.MetricRelabels;
    }

    /**
     * Set Label processing. This parameter is valid only when Flag is 0.
     * @param MetricRelabels Label processing. This parameter is valid only when Flag is 0.
     */
    public void setMetricRelabels(Relabeling [] MetricRelabels) {
        this.MetricRelabels = MetricRelabels;
    }

    /**
     * Get Custom metadata. This parameter is valid only when Flag is 0. 
     * @return MetricLabel Custom metadata. This parameter is valid only when Flag is 0.
     */
    public MetricConfigLabel getMetricLabel() {
        return this.MetricLabel;
    }

    /**
     * Set Custom metadata. This parameter is valid only when Flag is 0.
     * @param MetricLabel Custom metadata. This parameter is valid only when Flag is 0.
     */
    public void setMetricLabel(MetricConfigLabel MetricLabel) {
        this.MetricLabel = MetricLabel;
    }

    /**
     * Get Communication protocol. Valid values: HTTP and HTTPS. This parameter is valid only when Flag is 0. 
     * @return Scheme Communication protocol. Valid values: HTTP and HTTPS. This parameter is valid only when Flag is 0.
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Communication protocol. Valid values: HTTP and HTTPS. This parameter is valid only when Flag is 0.
     * @param Scheme Communication protocol. Valid values: HTTP and HTTPS. This parameter is valid only when Flag is 0.
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Collection frequency. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 60s 
     * @return ScrapeInterval Collection frequency. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 60s
     */
    public String getScrapeInterval() {
        return this.ScrapeInterval;
    }

    /**
     * Set Collection frequency. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 60s
     * @param ScrapeInterval Collection frequency. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 60s
     */
    public void setScrapeInterval(String ScrapeInterval) {
        this.ScrapeInterval = ScrapeInterval;
    }

    /**
     * Get Collection timeout. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 30s 
     * @return ScrapeTimeout Collection timeout. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 30s
     */
    public String getScrapeTimeout() {
        return this.ScrapeTimeout;
    }

    /**
     * Set Collection timeout. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 30s
     * @param ScrapeTimeout Collection timeout. This parameter is valid only when Flag is 0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 30s
     */
    public void setScrapeTimeout(String ScrapeTimeout) {
        this.ScrapeTimeout = ScrapeTimeout;
    }

    /**
     * Get How to handle tag conflicts. This parameter is valid only when Flag=0 and supports `true` and `false`.
-`false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts 
     * @return HonorLabels How to handle tag conflicts. This parameter is valid only when Flag=0 and supports `true` and `false`.
-`false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts
     */
    public Boolean getHonorLabels() {
        return this.HonorLabels;
    }

    /**
     * Set How to handle tag conflicts. This parameter is valid only when Flag=0 and supports `true` and `false`.
-`false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts
     * @param HonorLabels How to handle tag conflicts. This parameter is valid only when Flag=0 and supports `true` and `false`.
-`false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts
     */
    public void setHonorLabels(Boolean HonorLabels) {
        this.HonorLabels = HonorLabels;
    }

    /**
     * Get Collection configuration, which is a string in YAML format. It is required when Flag is 1. 
     * @return YamlSpec Collection configuration, which is a string in YAML format. It is required when Flag is 1.
     */
    public MetricYamlSpec getYamlSpec() {
        return this.YamlSpec;
    }

    /**
     * Set Collection configuration, which is a string in YAML format. It is required when Flag is 1.
     * @param YamlSpec Collection configuration, which is a string in YAML format. It is required when Flag is 1.
     */
    public void setYamlSpec(MetricYamlSpec YamlSpec) {
        this.YamlSpec = YamlSpec;
    }

    public CreateMetricConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMetricConfigRequest(CreateMetricConfigRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
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

    }
}

