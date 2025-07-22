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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartWebRecordRequest extends AbstractModel {

    /**
    * URL of the web page to be recorded
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * Maximum recording duration limit, in seconds. Valid range: [1800, 36000]. Default is 36,000 seconds (10 hours).
    */
    @SerializedName("MaxDurationLimit")
    @Expose
    private Long MaxDurationLimit;

    /**
    * [Required] Parameters related to cloud storage. Currently, Tencent Cloud Object Storage and Tencent Cloud VOD are supported, but third-party cloud storage is not supported. The storage format of the output file only supports hls or mp4.
    */
    @SerializedName("StorageParams")
    @Expose
    private StorageParams StorageParams;

    /**
    * web-page recording video parameters
    */
    @SerializedName("WebRecordVideoParams")
    @Expose
    private WebRecordVideoParams WebRecordVideoParams;

    /**
    * [Required] The SDKAppID of the TRTC room 
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * When sensitive to repetitive tasks, please pay attention to this value: To avoid tasks being initiated repeatedly in a short period, leading to task duplication, pass in the recording RecordId to identify the current task. The RecordId should be less than 32 bytes. If you carry the RecordId and initiate the start recording request more than once, only one task will be started, and the second one will report the error FailedOperation.TaskExist. Note that if the StartWebRecord call fails with an error other than FailedOperation.TaskExist, please change the RecordId and initiate the request again.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * If you want to push the stream to a CDN, you can use the PublishCdnParams.N parameter to set it. It supports pushing streams to up to 10 CDN addresses simultaneously. If the relay address is a Tencent Cloud CDN, please explicitly set IsTencentCdn to 1.
    */
    @SerializedName("PublishCdnParams")
    @Expose
    private McuPublishCdnParam [] PublishCdnParams;

    /**
    * The timeout for loading page resources during recording, in seconds. The default value is 0 seconds. This value must be greater than or equal to 0 seconds and less than or equal to 60 seconds. If page load timeout detection is not enabled for the recording page, please do not set this parameter.
    */
    @SerializedName("ReadyTimeout")
    @Expose
    private Long ReadyTimeout;

    /**
    * Render mobile mode parameters; do not set this parameter if you are not going to render mobile mode pages.
    */
    @SerializedName("EmulateMobileParams")
    @Expose
    private EmulateMobileParams EmulateMobileParams;

    /**
     * Get URL of the web page to be recorded 
     * @return RecordUrl URL of the web page to be recorded
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set URL of the web page to be recorded
     * @param RecordUrl URL of the web page to be recorded
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get Maximum recording duration limit, in seconds. Valid range: [1800, 36000]. Default is 36,000 seconds (10 hours). 
     * @return MaxDurationLimit Maximum recording duration limit, in seconds. Valid range: [1800, 36000]. Default is 36,000 seconds (10 hours).
     */
    public Long getMaxDurationLimit() {
        return this.MaxDurationLimit;
    }

    /**
     * Set Maximum recording duration limit, in seconds. Valid range: [1800, 36000]. Default is 36,000 seconds (10 hours).
     * @param MaxDurationLimit Maximum recording duration limit, in seconds. Valid range: [1800, 36000]. Default is 36,000 seconds (10 hours).
     */
    public void setMaxDurationLimit(Long MaxDurationLimit) {
        this.MaxDurationLimit = MaxDurationLimit;
    }

    /**
     * Get [Required] Parameters related to cloud storage. Currently, Tencent Cloud Object Storage and Tencent Cloud VOD are supported, but third-party cloud storage is not supported. The storage format of the output file only supports hls or mp4. 
     * @return StorageParams [Required] Parameters related to cloud storage. Currently, Tencent Cloud Object Storage and Tencent Cloud VOD are supported, but third-party cloud storage is not supported. The storage format of the output file only supports hls or mp4.
     */
    public StorageParams getStorageParams() {
        return this.StorageParams;
    }

    /**
     * Set [Required] Parameters related to cloud storage. Currently, Tencent Cloud Object Storage and Tencent Cloud VOD are supported, but third-party cloud storage is not supported. The storage format of the output file only supports hls or mp4.
     * @param StorageParams [Required] Parameters related to cloud storage. Currently, Tencent Cloud Object Storage and Tencent Cloud VOD are supported, but third-party cloud storage is not supported. The storage format of the output file only supports hls or mp4.
     */
    public void setStorageParams(StorageParams StorageParams) {
        this.StorageParams = StorageParams;
    }

    /**
     * Get web-page recording video parameters 
     * @return WebRecordVideoParams web-page recording video parameters
     */
    public WebRecordVideoParams getWebRecordVideoParams() {
        return this.WebRecordVideoParams;
    }

    /**
     * Set web-page recording video parameters
     * @param WebRecordVideoParams web-page recording video parameters
     */
    public void setWebRecordVideoParams(WebRecordVideoParams WebRecordVideoParams) {
        this.WebRecordVideoParams = WebRecordVideoParams;
    }

    /**
     * Get [Required] The SDKAppID of the TRTC room  
     * @return SdkAppId [Required] The SDKAppID of the TRTC room 
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set [Required] The SDKAppID of the TRTC room 
     * @param SdkAppId [Required] The SDKAppID of the TRTC room 
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get When sensitive to repetitive tasks, please pay attention to this value: To avoid tasks being initiated repeatedly in a short period, leading to task duplication, pass in the recording RecordId to identify the current task. The RecordId should be less than 32 bytes. If you carry the RecordId and initiate the start recording request more than once, only one task will be started, and the second one will report the error FailedOperation.TaskExist. Note that if the StartWebRecord call fails with an error other than FailedOperation.TaskExist, please change the RecordId and initiate the request again. 
     * @return RecordId When sensitive to repetitive tasks, please pay attention to this value: To avoid tasks being initiated repeatedly in a short period, leading to task duplication, pass in the recording RecordId to identify the current task. The RecordId should be less than 32 bytes. If you carry the RecordId and initiate the start recording request more than once, only one task will be started, and the second one will report the error FailedOperation.TaskExist. Note that if the StartWebRecord call fails with an error other than FailedOperation.TaskExist, please change the RecordId and initiate the request again.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set When sensitive to repetitive tasks, please pay attention to this value: To avoid tasks being initiated repeatedly in a short period, leading to task duplication, pass in the recording RecordId to identify the current task. The RecordId should be less than 32 bytes. If you carry the RecordId and initiate the start recording request more than once, only one task will be started, and the second one will report the error FailedOperation.TaskExist. Note that if the StartWebRecord call fails with an error other than FailedOperation.TaskExist, please change the RecordId and initiate the request again.
     * @param RecordId When sensitive to repetitive tasks, please pay attention to this value: To avoid tasks being initiated repeatedly in a short period, leading to task duplication, pass in the recording RecordId to identify the current task. The RecordId should be less than 32 bytes. If you carry the RecordId and initiate the start recording request more than once, only one task will be started, and the second one will report the error FailedOperation.TaskExist. Note that if the StartWebRecord call fails with an error other than FailedOperation.TaskExist, please change the RecordId and initiate the request again.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get If you want to push the stream to a CDN, you can use the PublishCdnParams.N parameter to set it. It supports pushing streams to up to 10 CDN addresses simultaneously. If the relay address is a Tencent Cloud CDN, please explicitly set IsTencentCdn to 1. 
     * @return PublishCdnParams If you want to push the stream to a CDN, you can use the PublishCdnParams.N parameter to set it. It supports pushing streams to up to 10 CDN addresses simultaneously. If the relay address is a Tencent Cloud CDN, please explicitly set IsTencentCdn to 1.
     */
    public McuPublishCdnParam [] getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set If you want to push the stream to a CDN, you can use the PublishCdnParams.N parameter to set it. It supports pushing streams to up to 10 CDN addresses simultaneously. If the relay address is a Tencent Cloud CDN, please explicitly set IsTencentCdn to 1.
     * @param PublishCdnParams If you want to push the stream to a CDN, you can use the PublishCdnParams.N parameter to set it. It supports pushing streams to up to 10 CDN addresses simultaneously. If the relay address is a Tencent Cloud CDN, please explicitly set IsTencentCdn to 1.
     */
    public void setPublishCdnParams(McuPublishCdnParam [] PublishCdnParams) {
        this.PublishCdnParams = PublishCdnParams;
    }

    /**
     * Get The timeout for loading page resources during recording, in seconds. The default value is 0 seconds. This value must be greater than or equal to 0 seconds and less than or equal to 60 seconds. If page load timeout detection is not enabled for the recording page, please do not set this parameter. 
     * @return ReadyTimeout The timeout for loading page resources during recording, in seconds. The default value is 0 seconds. This value must be greater than or equal to 0 seconds and less than or equal to 60 seconds. If page load timeout detection is not enabled for the recording page, please do not set this parameter.
     */
    public Long getReadyTimeout() {
        return this.ReadyTimeout;
    }

    /**
     * Set The timeout for loading page resources during recording, in seconds. The default value is 0 seconds. This value must be greater than or equal to 0 seconds and less than or equal to 60 seconds. If page load timeout detection is not enabled for the recording page, please do not set this parameter.
     * @param ReadyTimeout The timeout for loading page resources during recording, in seconds. The default value is 0 seconds. This value must be greater than or equal to 0 seconds and less than or equal to 60 seconds. If page load timeout detection is not enabled for the recording page, please do not set this parameter.
     */
    public void setReadyTimeout(Long ReadyTimeout) {
        this.ReadyTimeout = ReadyTimeout;
    }

    /**
     * Get Render mobile mode parameters; do not set this parameter if you are not going to render mobile mode pages. 
     * @return EmulateMobileParams Render mobile mode parameters; do not set this parameter if you are not going to render mobile mode pages.
     */
    public EmulateMobileParams getEmulateMobileParams() {
        return this.EmulateMobileParams;
    }

    /**
     * Set Render mobile mode parameters; do not set this parameter if you are not going to render mobile mode pages.
     * @param EmulateMobileParams Render mobile mode parameters; do not set this parameter if you are not going to render mobile mode pages.
     */
    public void setEmulateMobileParams(EmulateMobileParams EmulateMobileParams) {
        this.EmulateMobileParams = EmulateMobileParams;
    }

    public StartWebRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartWebRecordRequest(StartWebRecordRequest source) {
        if (source.RecordUrl != null) {
            this.RecordUrl = new String(source.RecordUrl);
        }
        if (source.MaxDurationLimit != null) {
            this.MaxDurationLimit = new Long(source.MaxDurationLimit);
        }
        if (source.StorageParams != null) {
            this.StorageParams = new StorageParams(source.StorageParams);
        }
        if (source.WebRecordVideoParams != null) {
            this.WebRecordVideoParams = new WebRecordVideoParams(source.WebRecordVideoParams);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.PublishCdnParams != null) {
            this.PublishCdnParams = new McuPublishCdnParam[source.PublishCdnParams.length];
            for (int i = 0; i < source.PublishCdnParams.length; i++) {
                this.PublishCdnParams[i] = new McuPublishCdnParam(source.PublishCdnParams[i]);
            }
        }
        if (source.ReadyTimeout != null) {
            this.ReadyTimeout = new Long(source.ReadyTimeout);
        }
        if (source.EmulateMobileParams != null) {
            this.EmulateMobileParams = new EmulateMobileParams(source.EmulateMobileParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);
        this.setParamSimple(map, prefix + "MaxDurationLimit", this.MaxDurationLimit);
        this.setParamObj(map, prefix + "StorageParams.", this.StorageParams);
        this.setParamObj(map, prefix + "WebRecordVideoParams.", this.WebRecordVideoParams);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamArrayObj(map, prefix + "PublishCdnParams.", this.PublishCdnParams);
        this.setParamSimple(map, prefix + "ReadyTimeout", this.ReadyTimeout);
        this.setParamObj(map, prefix + "EmulateMobileParams.", this.EmulateMobileParams);

    }
}

