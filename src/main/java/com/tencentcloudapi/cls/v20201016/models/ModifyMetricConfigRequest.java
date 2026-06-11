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

public class ModifyMetricConfigRequest extends AbstractModel {

    /**
    * Metric Topic id
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note: BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Metric collection configuration ID.
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Collection configuration source. Support: `0`, `1`.
-Self-built k8s
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
    * Operation status. Valid values: 0: applied; 1: paused.
    */
    @SerializedName("Operate")
    @Expose
    private Long Operate;

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
    * Collection frequency. This parameter is valid only when Flag=0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 60s
    */
    @SerializedName("ScrapeInterval")
    @Expose
    private String ScrapeInterval;

    /**
    * Collection timeout. This parameter is valid only when Flag=0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
    */
    @SerializedName("ScrapeTimeout")
    @Expose
    private String ScrapeTimeout;

    /**
    * How Prometheus handles tag conflicts. This parameter is valid only when Flag=0 && Type=1 and supports `true`, `false`.
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
     * Get Metric Topic id
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note: BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic. 
     * @return TopicId Metric Topic id
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note: BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Metric Topic id
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note: BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
     * @param TopicId Metric Topic id
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). Note: BizType 0: log topic (default value), 1: metric topic.
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). Note that BizType 0: log topic (default value), 1: metric topic.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Metric collection configuration ID. 
     * @return ConfigId Metric collection configuration ID.
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Metric collection configuration ID.
     * @param ConfigId Metric collection configuration ID.
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Collection configuration source. Support: `0`, `1`.
-Self-built k8s
- 1:TKE 
     * @return Source Collection configuration source. Support: `0`, `1`.
-Self-built k8s
- 1:TKE
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set Collection configuration source. Support: `0`, `1`.
-Self-built k8s
- 1:TKE
     * @param Source Collection configuration source. Support: `0`, `1`.
-Self-built k8s
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
     * Get Collection frequency. This parameter is valid only when Flag=0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 60s 
     * @return ScrapeInterval Collection frequency. This parameter is valid only when Flag=0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 60s
     */
    public String getScrapeInterval() {
        return this.ScrapeInterval;
    }

    /**
     * Set Collection frequency. This parameter is valid only when Flag=0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 60s
     * @param ScrapeInterval Collection frequency. This parameter is valid only when Flag=0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
-Default: 60s
     */
    public void setScrapeInterval(String ScrapeInterval) {
        this.ScrapeInterval = ScrapeInterval;
    }

    /**
     * Get Collection timeout. This parameter is valid only when Flag=0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$` 
     * @return ScrapeTimeout Collection timeout. This parameter is valid only when Flag=0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
     */
    public String getScrapeTimeout() {
        return this.ScrapeTimeout;
    }

    /**
     * Set Collection timeout. This parameter is valid only when Flag=0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
     * @param ScrapeTimeout Collection timeout. This parameter is valid only when Flag=0.
-Check format: `^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
     */
    public void setScrapeTimeout(String ScrapeTimeout) {
        this.ScrapeTimeout = ScrapeTimeout;
    }

    /**
     * Get How Prometheus handles tag conflicts. This parameter is valid only when Flag=0 && Type=1 and supports `true`, `false`.
-`false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts 
     * @return HonorLabels How Prometheus handles tag conflicts. This parameter is valid only when Flag=0 && Type=1 and supports `true`, `false`.
-`false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts
     */
    public Boolean getHonorLabels() {
        return this.HonorLabels;
    }

    /**
     * Set How Prometheus handles tag conflicts. This parameter is valid only when Flag=0 && Type=1 and supports `true`, `false`.
-`false`: Rename conflicting tags in configuration data
-`true`: Ignore server-side tag conflicts
     * @param HonorLabels How Prometheus handles tag conflicts. This parameter is valid only when Flag=0 && Type=1 and supports `true`, `false`.
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

    public ModifyMetricConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMetricConfigRequest(ModifyMetricConfigRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
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
        if (source.Operate != null) {
            this.Operate = new Long(source.Operate);
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
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
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

