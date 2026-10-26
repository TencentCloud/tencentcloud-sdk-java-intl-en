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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoDownloadUrlRequest extends AbstractModel {

    /**
    * Channel ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Download start time in UTC seconds. The longest period between the start and end times is 60 minutes and cannot span across days.
Note: The actual downloaded file duration may be longer than this period. You can obtain the actual download start time and end time by specifying the IsRespActualTime parameter. This is because downloads are aligned by TS segments to ensure data integrity and include the entire specified period.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * Download end time in UTC seconds. The longest period between the start and end times is 60 minutes and cannot span across days.
Note: The actual downloaded file duration may be longer than this period. You can obtain the actual download start time and end time by specifying the IsRespActualTime parameter. This is because downloads are aligned by TS segments to ensure data integrity and include the entire specified period.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * File format. "mp4": MP4 format. "ts": TS file format.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * data carries the actual download video recording start time and end time required or not
    */
    @SerializedName("IsRespActualTime")
    @Expose
    private Boolean IsRespActualTime;

    /**
    * Whether to return the private network download URL. Default false: the public network download URL is returned. If true, the private network download URL is returned.
    */
    @SerializedName("IsInternal")
    @Expose
    private Boolean IsInternal;

    /**
    * Set the valid period of the URL. The minimum value is 1 second and the maximum value is 86400 seconds. If not set, the default is 600 seconds.
    */
    @SerializedName("Expires")
    @Expose
    private Long Expires;

    /**
    * Whether the downloaded MP4 file supports G711 audio encoding. 
Note: If the audio encoding in cloud recording is AAC, then the downloaded MP4 supports AAC encoding by default.
If the audio encoding in the cloud recording is G711 and IsSupportG711 is set to true, the downloaded MP4 supports G711 audio encoding.
If the audio encoding in the cloud recording is G711 and IsSupportG711 is set to false, the downloaded MP4 does not support G711 audio encoding.
This parameter is valid only when FileType is mp4. If left unset, it defaults to false.
    */
    @SerializedName("IsSupportG711")
    @Expose
    private Boolean IsSupportG711;

    /**
     * Get Channel ID 
     * @return ChannelId Channel ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID
     * @param ChannelId Channel ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Download start time in UTC seconds. The longest period between the start and end times is 60 minutes and cannot span across days.
Note: The actual downloaded file duration may be longer than this period. You can obtain the actual download start time and end time by specifying the IsRespActualTime parameter. This is because downloads are aligned by TS segments to ensure data integrity and include the entire specified period. 
     * @return BeginTime Download start time in UTC seconds. The longest period between the start and end times is 60 minutes and cannot span across days.
Note: The actual downloaded file duration may be longer than this period. You can obtain the actual download start time and end time by specifying the IsRespActualTime parameter. This is because downloads are aligned by TS segments to ensure data integrity and include the entire specified period.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Download start time in UTC seconds. The longest period between the start and end times is 60 minutes and cannot span across days.
Note: The actual downloaded file duration may be longer than this period. You can obtain the actual download start time and end time by specifying the IsRespActualTime parameter. This is because downloads are aligned by TS segments to ensure data integrity and include the entire specified period.
     * @param BeginTime Download start time in UTC seconds. The longest period between the start and end times is 60 minutes and cannot span across days.
Note: The actual downloaded file duration may be longer than this period. You can obtain the actual download start time and end time by specifying the IsRespActualTime parameter. This is because downloads are aligned by TS segments to ensure data integrity and include the entire specified period.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Download end time in UTC seconds. The longest period between the start and end times is 60 minutes and cannot span across days.
Note: The actual downloaded file duration may be longer than this period. You can obtain the actual download start time and end time by specifying the IsRespActualTime parameter. This is because downloads are aligned by TS segments to ensure data integrity and include the entire specified period. 
     * @return EndTime Download end time in UTC seconds. The longest period between the start and end times is 60 minutes and cannot span across days.
Note: The actual downloaded file duration may be longer than this period. You can obtain the actual download start time and end time by specifying the IsRespActualTime parameter. This is because downloads are aligned by TS segments to ensure data integrity and include the entire specified period.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Download end time in UTC seconds. The longest period between the start and end times is 60 minutes and cannot span across days.
Note: The actual downloaded file duration may be longer than this period. You can obtain the actual download start time and end time by specifying the IsRespActualTime parameter. This is because downloads are aligned by TS segments to ensure data integrity and include the entire specified period.
     * @param EndTime Download end time in UTC seconds. The longest period between the start and end times is 60 minutes and cannot span across days.
Note: The actual downloaded file duration may be longer than this period. You can obtain the actual download start time and end time by specifying the IsRespActualTime parameter. This is because downloads are aligned by TS segments to ensure data integrity and include the entire specified period.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get File format. "mp4": MP4 format. "ts": TS file format. 
     * @return FileType File format. "mp4": MP4 format. "ts": TS file format.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File format. "mp4": MP4 format. "ts": TS file format.
     * @param FileType File format. "mp4": MP4 format. "ts": TS file format.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get data carries the actual download video recording start time and end time required or not 
     * @return IsRespActualTime data carries the actual download video recording start time and end time required or not
     */
    public Boolean getIsRespActualTime() {
        return this.IsRespActualTime;
    }

    /**
     * Set data carries the actual download video recording start time and end time required or not
     * @param IsRespActualTime data carries the actual download video recording start time and end time required or not
     */
    public void setIsRespActualTime(Boolean IsRespActualTime) {
        this.IsRespActualTime = IsRespActualTime;
    }

    /**
     * Get Whether to return the private network download URL. Default false: the public network download URL is returned. If true, the private network download URL is returned. 
     * @return IsInternal Whether to return the private network download URL. Default false: the public network download URL is returned. If true, the private network download URL is returned.
     */
    public Boolean getIsInternal() {
        return this.IsInternal;
    }

    /**
     * Set Whether to return the private network download URL. Default false: the public network download URL is returned. If true, the private network download URL is returned.
     * @param IsInternal Whether to return the private network download URL. Default false: the public network download URL is returned. If true, the private network download URL is returned.
     */
    public void setIsInternal(Boolean IsInternal) {
        this.IsInternal = IsInternal;
    }

    /**
     * Get Set the valid period of the URL. The minimum value is 1 second and the maximum value is 86400 seconds. If not set, the default is 600 seconds. 
     * @return Expires Set the valid period of the URL. The minimum value is 1 second and the maximum value is 86400 seconds. If not set, the default is 600 seconds.
     */
    public Long getExpires() {
        return this.Expires;
    }

    /**
     * Set Set the valid period of the URL. The minimum value is 1 second and the maximum value is 86400 seconds. If not set, the default is 600 seconds.
     * @param Expires Set the valid period of the URL. The minimum value is 1 second and the maximum value is 86400 seconds. If not set, the default is 600 seconds.
     */
    public void setExpires(Long Expires) {
        this.Expires = Expires;
    }

    /**
     * Get Whether the downloaded MP4 file supports G711 audio encoding. 
Note: If the audio encoding in cloud recording is AAC, then the downloaded MP4 supports AAC encoding by default.
If the audio encoding in the cloud recording is G711 and IsSupportG711 is set to true, the downloaded MP4 supports G711 audio encoding.
If the audio encoding in the cloud recording is G711 and IsSupportG711 is set to false, the downloaded MP4 does not support G711 audio encoding.
This parameter is valid only when FileType is mp4. If left unset, it defaults to false. 
     * @return IsSupportG711 Whether the downloaded MP4 file supports G711 audio encoding. 
Note: If the audio encoding in cloud recording is AAC, then the downloaded MP4 supports AAC encoding by default.
If the audio encoding in the cloud recording is G711 and IsSupportG711 is set to true, the downloaded MP4 supports G711 audio encoding.
If the audio encoding in the cloud recording is G711 and IsSupportG711 is set to false, the downloaded MP4 does not support G711 audio encoding.
This parameter is valid only when FileType is mp4. If left unset, it defaults to false.
     */
    public Boolean getIsSupportG711() {
        return this.IsSupportG711;
    }

    /**
     * Set Whether the downloaded MP4 file supports G711 audio encoding. 
Note: If the audio encoding in cloud recording is AAC, then the downloaded MP4 supports AAC encoding by default.
If the audio encoding in the cloud recording is G711 and IsSupportG711 is set to true, the downloaded MP4 supports G711 audio encoding.
If the audio encoding in the cloud recording is G711 and IsSupportG711 is set to false, the downloaded MP4 does not support G711 audio encoding.
This parameter is valid only when FileType is mp4. If left unset, it defaults to false.
     * @param IsSupportG711 Whether the downloaded MP4 file supports G711 audio encoding. 
Note: If the audio encoding in cloud recording is AAC, then the downloaded MP4 supports AAC encoding by default.
If the audio encoding in the cloud recording is G711 and IsSupportG711 is set to true, the downloaded MP4 supports G711 audio encoding.
If the audio encoding in the cloud recording is G711 and IsSupportG711 is set to false, the downloaded MP4 does not support G711 audio encoding.
This parameter is valid only when FileType is mp4. If left unset, it defaults to false.
     */
    public void setIsSupportG711(Boolean IsSupportG711) {
        this.IsSupportG711 = IsSupportG711;
    }

    public DescribeVideoDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoDownloadUrlRequest(DescribeVideoDownloadUrlRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.IsRespActualTime != null) {
            this.IsRespActualTime = new Boolean(source.IsRespActualTime);
        }
        if (source.IsInternal != null) {
            this.IsInternal = new Boolean(source.IsInternal);
        }
        if (source.Expires != null) {
            this.Expires = new Long(source.Expires);
        }
        if (source.IsSupportG711 != null) {
            this.IsSupportG711 = new Boolean(source.IsSupportG711);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "IsRespActualTime", this.IsRespActualTime);
        this.setParamSimple(map, prefix + "IsInternal", this.IsInternal);
        this.setParamSimple(map, prefix + "Expires", this.Expires);
        this.setParamSimple(map, prefix + "IsSupportG711", this.IsSupportG711);

    }
}

