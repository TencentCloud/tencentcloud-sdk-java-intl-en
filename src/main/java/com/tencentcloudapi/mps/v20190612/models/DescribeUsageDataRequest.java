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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsageDataRequest extends AbstractModel {

    /**
    * Start date. Use the [ISO date and time format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End date, which should be greater than or equal to the start date. Use the [ISO date and time format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Queries the MPS task type. The transcoding task is queried by default.
<li>Transcode: transcoding.</li>
<li>Enhance: enhancement.</li>
<li>AIAnalysis: intelligent analysis.</li>
<li>AIRecognition: intelligent recognition.</li>
<li>AIReview: content moderation.</li>
<li>Snapshot: screenshot.</li>
<li>AnimatedGraphics: conversion to GIF.</li>
<li>AiQualityControl: media quality inspection.</li>
<li>Evaluation: video assessment.</li>
<li>ImageProcess: image processing.</li>
<li>AddBlindWatermark: add a basic copyright digital watermark.</li>
<li>AddNagraWatermark: add a NAGRA digital watermark.</li>
<li>ExtractBlindWatermark: extract a basic copyright digital watermark.</li>
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * MPS park. ap-guangzhou park is returned by default.
<li>ap-guangzhou: Guangzhou.</li>
<li>ap-hongkong: Hong Kong (China).</li>
<li>ap-taipei: Taipei (China).</li>
<li>ap-singapore: Singapore.</li>
<li>ap-mumbai: India.</li>
<li>ap-jakarta: Jakarta.</li>
<li>ap-seoul: Seoul.</li>
<li>ap-bangkok: Thailand.</li>
<li>ap-tokyo: Japan.</li>
<li>na-siliconvalley: Silicon Valley.</li>
<li>na-ashburn: Virginia.</li>
<li>na-toronto: Toronto.</li>
<li>sa-saopaulo: São Paulo.</li>
<li>eu-frankfurt: Frankfurt.</li>
<li>eu-moscow: Russia.</li>
<li>aws: AWS.</li>
    */
    @SerializedName("ProcessRegions")
    @Expose
    private String [] ProcessRegions;

    /**
     * Get Start date. Use the [ISO date and time format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return StartTime Start date. Use the [ISO date and time format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start date. Use the [ISO date and time format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param StartTime Start date. Use the [ISO date and time format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End date, which should be greater than or equal to the start date. Use the [ISO date and time format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return EndTime End date, which should be greater than or equal to the start date. Use the [ISO date and time format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End date, which should be greater than or equal to the start date. Use the [ISO date and time format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param EndTime End date, which should be greater than or equal to the start date. Use the [ISO date and time format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Queries the MPS task type. The transcoding task is queried by default.
<li>Transcode: transcoding.</li>
<li>Enhance: enhancement.</li>
<li>AIAnalysis: intelligent analysis.</li>
<li>AIRecognition: intelligent recognition.</li>
<li>AIReview: content moderation.</li>
<li>Snapshot: screenshot.</li>
<li>AnimatedGraphics: conversion to GIF.</li>
<li>AiQualityControl: media quality inspection.</li>
<li>Evaluation: video assessment.</li>
<li>ImageProcess: image processing.</li>
<li>AddBlindWatermark: add a basic copyright digital watermark.</li>
<li>AddNagraWatermark: add a NAGRA digital watermark.</li>
<li>ExtractBlindWatermark: extract a basic copyright digital watermark.</li> 
     * @return Types Queries the MPS task type. The transcoding task is queried by default.
<li>Transcode: transcoding.</li>
<li>Enhance: enhancement.</li>
<li>AIAnalysis: intelligent analysis.</li>
<li>AIRecognition: intelligent recognition.</li>
<li>AIReview: content moderation.</li>
<li>Snapshot: screenshot.</li>
<li>AnimatedGraphics: conversion to GIF.</li>
<li>AiQualityControl: media quality inspection.</li>
<li>Evaluation: video assessment.</li>
<li>ImageProcess: image processing.</li>
<li>AddBlindWatermark: add a basic copyright digital watermark.</li>
<li>AddNagraWatermark: add a NAGRA digital watermark.</li>
<li>ExtractBlindWatermark: extract a basic copyright digital watermark.</li>
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set Queries the MPS task type. The transcoding task is queried by default.
<li>Transcode: transcoding.</li>
<li>Enhance: enhancement.</li>
<li>AIAnalysis: intelligent analysis.</li>
<li>AIRecognition: intelligent recognition.</li>
<li>AIReview: content moderation.</li>
<li>Snapshot: screenshot.</li>
<li>AnimatedGraphics: conversion to GIF.</li>
<li>AiQualityControl: media quality inspection.</li>
<li>Evaluation: video assessment.</li>
<li>ImageProcess: image processing.</li>
<li>AddBlindWatermark: add a basic copyright digital watermark.</li>
<li>AddNagraWatermark: add a NAGRA digital watermark.</li>
<li>ExtractBlindWatermark: extract a basic copyright digital watermark.</li>
     * @param Types Queries the MPS task type. The transcoding task is queried by default.
<li>Transcode: transcoding.</li>
<li>Enhance: enhancement.</li>
<li>AIAnalysis: intelligent analysis.</li>
<li>AIRecognition: intelligent recognition.</li>
<li>AIReview: content moderation.</li>
<li>Snapshot: screenshot.</li>
<li>AnimatedGraphics: conversion to GIF.</li>
<li>AiQualityControl: media quality inspection.</li>
<li>Evaluation: video assessment.</li>
<li>ImageProcess: image processing.</li>
<li>AddBlindWatermark: add a basic copyright digital watermark.</li>
<li>AddNagraWatermark: add a NAGRA digital watermark.</li>
<li>ExtractBlindWatermark: extract a basic copyright digital watermark.</li>
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get MPS park. ap-guangzhou park is returned by default.
<li>ap-guangzhou: Guangzhou.</li>
<li>ap-hongkong: Hong Kong (China).</li>
<li>ap-taipei: Taipei (China).</li>
<li>ap-singapore: Singapore.</li>
<li>ap-mumbai: India.</li>
<li>ap-jakarta: Jakarta.</li>
<li>ap-seoul: Seoul.</li>
<li>ap-bangkok: Thailand.</li>
<li>ap-tokyo: Japan.</li>
<li>na-siliconvalley: Silicon Valley.</li>
<li>na-ashburn: Virginia.</li>
<li>na-toronto: Toronto.</li>
<li>sa-saopaulo: São Paulo.</li>
<li>eu-frankfurt: Frankfurt.</li>
<li>eu-moscow: Russia.</li>
<li>aws: AWS.</li> 
     * @return ProcessRegions MPS park. ap-guangzhou park is returned by default.
<li>ap-guangzhou: Guangzhou.</li>
<li>ap-hongkong: Hong Kong (China).</li>
<li>ap-taipei: Taipei (China).</li>
<li>ap-singapore: Singapore.</li>
<li>ap-mumbai: India.</li>
<li>ap-jakarta: Jakarta.</li>
<li>ap-seoul: Seoul.</li>
<li>ap-bangkok: Thailand.</li>
<li>ap-tokyo: Japan.</li>
<li>na-siliconvalley: Silicon Valley.</li>
<li>na-ashburn: Virginia.</li>
<li>na-toronto: Toronto.</li>
<li>sa-saopaulo: São Paulo.</li>
<li>eu-frankfurt: Frankfurt.</li>
<li>eu-moscow: Russia.</li>
<li>aws: AWS.</li>
     */
    public String [] getProcessRegions() {
        return this.ProcessRegions;
    }

    /**
     * Set MPS park. ap-guangzhou park is returned by default.
<li>ap-guangzhou: Guangzhou.</li>
<li>ap-hongkong: Hong Kong (China).</li>
<li>ap-taipei: Taipei (China).</li>
<li>ap-singapore: Singapore.</li>
<li>ap-mumbai: India.</li>
<li>ap-jakarta: Jakarta.</li>
<li>ap-seoul: Seoul.</li>
<li>ap-bangkok: Thailand.</li>
<li>ap-tokyo: Japan.</li>
<li>na-siliconvalley: Silicon Valley.</li>
<li>na-ashburn: Virginia.</li>
<li>na-toronto: Toronto.</li>
<li>sa-saopaulo: São Paulo.</li>
<li>eu-frankfurt: Frankfurt.</li>
<li>eu-moscow: Russia.</li>
<li>aws: AWS.</li>
     * @param ProcessRegions MPS park. ap-guangzhou park is returned by default.
<li>ap-guangzhou: Guangzhou.</li>
<li>ap-hongkong: Hong Kong (China).</li>
<li>ap-taipei: Taipei (China).</li>
<li>ap-singapore: Singapore.</li>
<li>ap-mumbai: India.</li>
<li>ap-jakarta: Jakarta.</li>
<li>ap-seoul: Seoul.</li>
<li>ap-bangkok: Thailand.</li>
<li>ap-tokyo: Japan.</li>
<li>na-siliconvalley: Silicon Valley.</li>
<li>na-ashburn: Virginia.</li>
<li>na-toronto: Toronto.</li>
<li>sa-saopaulo: São Paulo.</li>
<li>eu-frankfurt: Frankfurt.</li>
<li>eu-moscow: Russia.</li>
<li>aws: AWS.</li>
     */
    public void setProcessRegions(String [] ProcessRegions) {
        this.ProcessRegions = ProcessRegions;
    }

    public DescribeUsageDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsageDataRequest(DescribeUsageDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
        if (source.ProcessRegions != null) {
            this.ProcessRegions = new String[source.ProcessRegions.length];
            for (int i = 0; i < source.ProcessRegions.length; i++) {
                this.ProcessRegions[i] = new String(source.ProcessRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamArraySimple(map, prefix + "ProcessRegions.", this.ProcessRegions);

    }
}

