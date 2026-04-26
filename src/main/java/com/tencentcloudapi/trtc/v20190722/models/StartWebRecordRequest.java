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
    * [Required] webpage URL that needs to be recorded.
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * [Required] cloud storage related parameters. currently supports tencent cloud object storage as well as VOD. no support for third-party cloud storage. the storage format of the output file is only supported for hls or mp4.
    */
    @SerializedName("StorageParams")
    @Expose
    private StorageParams StorageParams;

    /**
    * [Required] the SdkAppId of TRTC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Maximum recording duration limit in seconds. valid values [1800, 86400]. default 86400s (24 hr).
    */
    @SerializedName("MaxDurationLimit")
    @Expose
    private Long MaxDurationLimit;

    /**
    * Page recording video parameter.
    */
    @SerializedName("WebRecordVideoParams")
    @Expose
    private WebRecordVideoParams WebRecordVideoParams;

    /**
    * When sensitive to repetition tasks, pay attention to this value: to avoid triggering tasks repeatedly in a short time frame, which may lead to task duplication.
Import the recording RecordId to identify the task, less than 32 bytes. if carrying RecordId initiates start recording requests more than twice, only one task will start up, and the second will report error FailedOperation.TaskExist. note that when StartWebRecord call fails instead of FailedOperation.TaskExist error, change RecordId and re-initiate the request.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * If you want to push stream to CDN, you can configure parameters in PublishCdnParams.N. it supports streaming simultaneously to up to 10 CDN addresses. if the relay address is tencent cloud CDN, set IsTencentCdn to 1.
    */
    @SerializedName("PublishCdnParams")
    @Expose
    private McuPublishCdnParam [] PublishCdnParams;

    /**
    * Timeout period for recording page resource loading, unit: second. default value is 0, which must be greater than or equal to 0 and less than or equal to 60. do not set this parameter when page loading timeout detection is disabled for the recording page.
    */
    @SerializedName("ReadyTimeout")
    @Expose
    private Long ReadyTimeout;

    /**
    * Render the mobile mode parameter. do not set this parameter when not preparing to render the mobile mode webpage.
    */
    @SerializedName("EmulateMobileParams")
    @Expose
    private EmulateMobileParams EmulateMobileParams;

    /**
     * Get [Required] webpage URL that needs to be recorded. 
     * @return RecordUrl [Required] webpage URL that needs to be recorded.
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set [Required] webpage URL that needs to be recorded.
     * @param RecordUrl [Required] webpage URL that needs to be recorded.
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get [Required] cloud storage related parameters. currently supports tencent cloud object storage as well as VOD. no support for third-party cloud storage. the storage format of the output file is only supported for hls or mp4. 
     * @return StorageParams [Required] cloud storage related parameters. currently supports tencent cloud object storage as well as VOD. no support for third-party cloud storage. the storage format of the output file is only supported for hls or mp4.
     */
    public StorageParams getStorageParams() {
        return this.StorageParams;
    }

    /**
     * Set [Required] cloud storage related parameters. currently supports tencent cloud object storage as well as VOD. no support for third-party cloud storage. the storage format of the output file is only supported for hls or mp4.
     * @param StorageParams [Required] cloud storage related parameters. currently supports tencent cloud object storage as well as VOD. no support for third-party cloud storage. the storage format of the output file is only supported for hls or mp4.
     */
    public void setStorageParams(StorageParams StorageParams) {
        this.StorageParams = StorageParams;
    }

    /**
     * Get [Required] the SdkAppId of TRTC. 
     * @return SdkAppId [Required] the SdkAppId of TRTC.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set [Required] the SdkAppId of TRTC.
     * @param SdkAppId [Required] the SdkAppId of TRTC.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Maximum recording duration limit in seconds. valid values [1800, 86400]. default 86400s (24 hr). 
     * @return MaxDurationLimit Maximum recording duration limit in seconds. valid values [1800, 86400]. default 86400s (24 hr).
     */
    public Long getMaxDurationLimit() {
        return this.MaxDurationLimit;
    }

    /**
     * Set Maximum recording duration limit in seconds. valid values [1800, 86400]. default 86400s (24 hr).
     * @param MaxDurationLimit Maximum recording duration limit in seconds. valid values [1800, 86400]. default 86400s (24 hr).
     */
    public void setMaxDurationLimit(Long MaxDurationLimit) {
        this.MaxDurationLimit = MaxDurationLimit;
    }

    /**
     * Get Page recording video parameter. 
     * @return WebRecordVideoParams Page recording video parameter.
     */
    public WebRecordVideoParams getWebRecordVideoParams() {
        return this.WebRecordVideoParams;
    }

    /**
     * Set Page recording video parameter.
     * @param WebRecordVideoParams Page recording video parameter.
     */
    public void setWebRecordVideoParams(WebRecordVideoParams WebRecordVideoParams) {
        this.WebRecordVideoParams = WebRecordVideoParams;
    }

    /**
     * Get When sensitive to repetition tasks, pay attention to this value: to avoid triggering tasks repeatedly in a short time frame, which may lead to task duplication.
Import the recording RecordId to identify the task, less than 32 bytes. if carrying RecordId initiates start recording requests more than twice, only one task will start up, and the second will report error FailedOperation.TaskExist. note that when StartWebRecord call fails instead of FailedOperation.TaskExist error, change RecordId and re-initiate the request. 
     * @return RecordId When sensitive to repetition tasks, pay attention to this value: to avoid triggering tasks repeatedly in a short time frame, which may lead to task duplication.
Import the recording RecordId to identify the task, less than 32 bytes. if carrying RecordId initiates start recording requests more than twice, only one task will start up, and the second will report error FailedOperation.TaskExist. note that when StartWebRecord call fails instead of FailedOperation.TaskExist error, change RecordId and re-initiate the request.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set When sensitive to repetition tasks, pay attention to this value: to avoid triggering tasks repeatedly in a short time frame, which may lead to task duplication.
Import the recording RecordId to identify the task, less than 32 bytes. if carrying RecordId initiates start recording requests more than twice, only one task will start up, and the second will report error FailedOperation.TaskExist. note that when StartWebRecord call fails instead of FailedOperation.TaskExist error, change RecordId and re-initiate the request.
     * @param RecordId When sensitive to repetition tasks, pay attention to this value: to avoid triggering tasks repeatedly in a short time frame, which may lead to task duplication.
Import the recording RecordId to identify the task, less than 32 bytes. if carrying RecordId initiates start recording requests more than twice, only one task will start up, and the second will report error FailedOperation.TaskExist. note that when StartWebRecord call fails instead of FailedOperation.TaskExist error, change RecordId and re-initiate the request.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get If you want to push stream to CDN, you can configure parameters in PublishCdnParams.N. it supports streaming simultaneously to up to 10 CDN addresses. if the relay address is tencent cloud CDN, set IsTencentCdn to 1. 
     * @return PublishCdnParams If you want to push stream to CDN, you can configure parameters in PublishCdnParams.N. it supports streaming simultaneously to up to 10 CDN addresses. if the relay address is tencent cloud CDN, set IsTencentCdn to 1.
     */
    public McuPublishCdnParam [] getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set If you want to push stream to CDN, you can configure parameters in PublishCdnParams.N. it supports streaming simultaneously to up to 10 CDN addresses. if the relay address is tencent cloud CDN, set IsTencentCdn to 1.
     * @param PublishCdnParams If you want to push stream to CDN, you can configure parameters in PublishCdnParams.N. it supports streaming simultaneously to up to 10 CDN addresses. if the relay address is tencent cloud CDN, set IsTencentCdn to 1.
     */
    public void setPublishCdnParams(McuPublishCdnParam [] PublishCdnParams) {
        this.PublishCdnParams = PublishCdnParams;
    }

    /**
     * Get Timeout period for recording page resource loading, unit: second. default value is 0, which must be greater than or equal to 0 and less than or equal to 60. do not set this parameter when page loading timeout detection is disabled for the recording page. 
     * @return ReadyTimeout Timeout period for recording page resource loading, unit: second. default value is 0, which must be greater than or equal to 0 and less than or equal to 60. do not set this parameter when page loading timeout detection is disabled for the recording page.
     */
    public Long getReadyTimeout() {
        return this.ReadyTimeout;
    }

    /**
     * Set Timeout period for recording page resource loading, unit: second. default value is 0, which must be greater than or equal to 0 and less than or equal to 60. do not set this parameter when page loading timeout detection is disabled for the recording page.
     * @param ReadyTimeout Timeout period for recording page resource loading, unit: second. default value is 0, which must be greater than or equal to 0 and less than or equal to 60. do not set this parameter when page loading timeout detection is disabled for the recording page.
     */
    public void setReadyTimeout(Long ReadyTimeout) {
        this.ReadyTimeout = ReadyTimeout;
    }

    /**
     * Get Render the mobile mode parameter. do not set this parameter when not preparing to render the mobile mode webpage. 
     * @return EmulateMobileParams Render the mobile mode parameter. do not set this parameter when not preparing to render the mobile mode webpage.
     */
    public EmulateMobileParams getEmulateMobileParams() {
        return this.EmulateMobileParams;
    }

    /**
     * Set Render the mobile mode parameter. do not set this parameter when not preparing to render the mobile mode webpage.
     * @param EmulateMobileParams Render the mobile mode parameter. do not set this parameter when not preparing to render the mobile mode webpage.
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
        if (source.StorageParams != null) {
            this.StorageParams = new StorageParams(source.StorageParams);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.MaxDurationLimit != null) {
            this.MaxDurationLimit = new Long(source.MaxDurationLimit);
        }
        if (source.WebRecordVideoParams != null) {
            this.WebRecordVideoParams = new WebRecordVideoParams(source.WebRecordVideoParams);
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
        this.setParamObj(map, prefix + "StorageParams.", this.StorageParams);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "MaxDurationLimit", this.MaxDurationLimit);
        this.setParamObj(map, prefix + "WebRecordVideoParams.", this.WebRecordVideoParams);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamArrayObj(map, prefix + "PublishCdnParams.", this.PublishCdnParams);
        this.setParamSimple(map, prefix + "ReadyTimeout", this.ReadyTimeout);
        this.setParamObj(map, prefix + "EmulateMobileParams.", this.EmulateMobileParams);

    }
}

