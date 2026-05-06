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
    * <p>Start date. Use ISO date format.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End date, which must be greater than or equal to the start date. Use the <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p><p>Parameter format: 2019-07-16T06:21:28Z.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Media processing task type to query. Default value: Transcode. Valid values: </p><li>Transcode: Transcoding, </li><li>Enhance: Enhancement, </li><li>AIAnalysis: AI Analysis, </li><li>AIRecognition: AI Recognition, </li><li>AIReview: AI Review, </li><li>Snapshot: Snapshot, </li><li>AnimatedGraphics: Animated Graphics, </li><li>AiQualityControl: Quality Control, </li><li>Evaluation: Video Evaluation, </li><li>ImageProcess: Image Processing, </li><li>AddBlindWatermark: Add Basic Copyright Digital Watermark, </li><li>AddNagraWatermark: Add NAGRA Digital Watermark, </li><li>ExtractBlindWatermark: Extract Basic Copyright Digital Watermark, </li><li>AIGCVideo: AIGC Video Generation, </li><li>AIGCImage: AIGC Image Generation.</li>
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * <p>Media processing region. Default value: ap-guangzhou. Valid values: </p><li>ap-guangzhou: Guangzhou, </li><li>ap-hongkong: Hong Kong (China), </li><li>ap-taipei: Taiwan (China), </li><li>ap-singapore: Singapore, </li><li>ap-mumbai: India, </li><li>ap-jakarta: Jakarta, </li><li>ap-seoul: Seoul, </li><li>ap-bangkok: Thailand, </li><li>ap-tokyo: Japan, </li><li>na-siliconvalley: Silicon Valley (USA), </li><li>na-ashburn: Virginia, </li><li>na-toronto: Toronto, </li><li>sa-saopaulo: Sao Paulo, </li><li>eu-frankfurt: Frankfurt, </li><li>eu-moscow: Russia, </li><li>aws: AWS.</li>
    */
    @SerializedName("ProcessRegions")
    @Expose
    private String [] ProcessRegions;

    /**
     * Get <p>Start date. Use ISO date format.</p> 
     * @return StartTime <p>Start date. Use ISO date format.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start date. Use ISO date format.</p>
     * @param StartTime <p>Start date. Use ISO date format.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End date, which must be greater than or equal to the start date. Use the <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p><p>Parameter format: 2019-07-16T06:21:28Z.</p> 
     * @return EndTime <p>End date, which must be greater than or equal to the start date. Use the <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p><p>Parameter format: 2019-07-16T06:21:28Z.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End date, which must be greater than or equal to the start date. Use the <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p><p>Parameter format: 2019-07-16T06:21:28Z.</p>
     * @param EndTime <p>End date, which must be greater than or equal to the start date. Use the <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p><p>Parameter format: 2019-07-16T06:21:28Z.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Media processing task type to query. Default value: Transcode. Valid values: </p><li>Transcode: Transcoding, </li><li>Enhance: Enhancement, </li><li>AIAnalysis: AI Analysis, </li><li>AIRecognition: AI Recognition, </li><li>AIReview: AI Review, </li><li>Snapshot: Snapshot, </li><li>AnimatedGraphics: Animated Graphics, </li><li>AiQualityControl: Quality Control, </li><li>Evaluation: Video Evaluation, </li><li>ImageProcess: Image Processing, </li><li>AddBlindWatermark: Add Basic Copyright Digital Watermark, </li><li>AddNagraWatermark: Add NAGRA Digital Watermark, </li><li>ExtractBlindWatermark: Extract Basic Copyright Digital Watermark, </li><li>AIGCVideo: AIGC Video Generation, </li><li>AIGCImage: AIGC Image Generation.</li> 
     * @return Types <p>Media processing task type to query. Default value: Transcode. Valid values: </p><li>Transcode: Transcoding, </li><li>Enhance: Enhancement, </li><li>AIAnalysis: AI Analysis, </li><li>AIRecognition: AI Recognition, </li><li>AIReview: AI Review, </li><li>Snapshot: Snapshot, </li><li>AnimatedGraphics: Animated Graphics, </li><li>AiQualityControl: Quality Control, </li><li>Evaluation: Video Evaluation, </li><li>ImageProcess: Image Processing, </li><li>AddBlindWatermark: Add Basic Copyright Digital Watermark, </li><li>AddNagraWatermark: Add NAGRA Digital Watermark, </li><li>ExtractBlindWatermark: Extract Basic Copyright Digital Watermark, </li><li>AIGCVideo: AIGC Video Generation, </li><li>AIGCImage: AIGC Image Generation.</li>
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set <p>Media processing task type to query. Default value: Transcode. Valid values: </p><li>Transcode: Transcoding, </li><li>Enhance: Enhancement, </li><li>AIAnalysis: AI Analysis, </li><li>AIRecognition: AI Recognition, </li><li>AIReview: AI Review, </li><li>Snapshot: Snapshot, </li><li>AnimatedGraphics: Animated Graphics, </li><li>AiQualityControl: Quality Control, </li><li>Evaluation: Video Evaluation, </li><li>ImageProcess: Image Processing, </li><li>AddBlindWatermark: Add Basic Copyright Digital Watermark, </li><li>AddNagraWatermark: Add NAGRA Digital Watermark, </li><li>ExtractBlindWatermark: Extract Basic Copyright Digital Watermark, </li><li>AIGCVideo: AIGC Video Generation, </li><li>AIGCImage: AIGC Image Generation.</li>
     * @param Types <p>Media processing task type to query. Default value: Transcode. Valid values: </p><li>Transcode: Transcoding, </li><li>Enhance: Enhancement, </li><li>AIAnalysis: AI Analysis, </li><li>AIRecognition: AI Recognition, </li><li>AIReview: AI Review, </li><li>Snapshot: Snapshot, </li><li>AnimatedGraphics: Animated Graphics, </li><li>AiQualityControl: Quality Control, </li><li>Evaluation: Video Evaluation, </li><li>ImageProcess: Image Processing, </li><li>AddBlindWatermark: Add Basic Copyright Digital Watermark, </li><li>AddNagraWatermark: Add NAGRA Digital Watermark, </li><li>ExtractBlindWatermark: Extract Basic Copyright Digital Watermark, </li><li>AIGCVideo: AIGC Video Generation, </li><li>AIGCImage: AIGC Image Generation.</li>
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get <p>Media processing region. Default value: ap-guangzhou. Valid values: </p><li>ap-guangzhou: Guangzhou, </li><li>ap-hongkong: Hong Kong (China), </li><li>ap-taipei: Taiwan (China), </li><li>ap-singapore: Singapore, </li><li>ap-mumbai: India, </li><li>ap-jakarta: Jakarta, </li><li>ap-seoul: Seoul, </li><li>ap-bangkok: Thailand, </li><li>ap-tokyo: Japan, </li><li>na-siliconvalley: Silicon Valley (USA), </li><li>na-ashburn: Virginia, </li><li>na-toronto: Toronto, </li><li>sa-saopaulo: Sao Paulo, </li><li>eu-frankfurt: Frankfurt, </li><li>eu-moscow: Russia, </li><li>aws: AWS.</li> 
     * @return ProcessRegions <p>Media processing region. Default value: ap-guangzhou. Valid values: </p><li>ap-guangzhou: Guangzhou, </li><li>ap-hongkong: Hong Kong (China), </li><li>ap-taipei: Taiwan (China), </li><li>ap-singapore: Singapore, </li><li>ap-mumbai: India, </li><li>ap-jakarta: Jakarta, </li><li>ap-seoul: Seoul, </li><li>ap-bangkok: Thailand, </li><li>ap-tokyo: Japan, </li><li>na-siliconvalley: Silicon Valley (USA), </li><li>na-ashburn: Virginia, </li><li>na-toronto: Toronto, </li><li>sa-saopaulo: Sao Paulo, </li><li>eu-frankfurt: Frankfurt, </li><li>eu-moscow: Russia, </li><li>aws: AWS.</li>
     */
    public String [] getProcessRegions() {
        return this.ProcessRegions;
    }

    /**
     * Set <p>Media processing region. Default value: ap-guangzhou. Valid values: </p><li>ap-guangzhou: Guangzhou, </li><li>ap-hongkong: Hong Kong (China), </li><li>ap-taipei: Taiwan (China), </li><li>ap-singapore: Singapore, </li><li>ap-mumbai: India, </li><li>ap-jakarta: Jakarta, </li><li>ap-seoul: Seoul, </li><li>ap-bangkok: Thailand, </li><li>ap-tokyo: Japan, </li><li>na-siliconvalley: Silicon Valley (USA), </li><li>na-ashburn: Virginia, </li><li>na-toronto: Toronto, </li><li>sa-saopaulo: Sao Paulo, </li><li>eu-frankfurt: Frankfurt, </li><li>eu-moscow: Russia, </li><li>aws: AWS.</li>
     * @param ProcessRegions <p>Media processing region. Default value: ap-guangzhou. Valid values: </p><li>ap-guangzhou: Guangzhou, </li><li>ap-hongkong: Hong Kong (China), </li><li>ap-taipei: Taiwan (China), </li><li>ap-singapore: Singapore, </li><li>ap-mumbai: India, </li><li>ap-jakarta: Jakarta, </li><li>ap-seoul: Seoul, </li><li>ap-bangkok: Thailand, </li><li>ap-tokyo: Japan, </li><li>na-siliconvalley: Silicon Valley (USA), </li><li>na-ashburn: Virginia, </li><li>na-toronto: Toronto, </li><li>sa-saopaulo: Sao Paulo, </li><li>eu-frankfurt: Frankfurt, </li><li>eu-moscow: Russia, </li><li>aws: AWS.</li>
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

