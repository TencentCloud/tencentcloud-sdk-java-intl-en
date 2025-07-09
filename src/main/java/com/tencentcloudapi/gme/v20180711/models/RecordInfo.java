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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordInfo extends AbstractModel {

    /**
    * User ID. The value is `0` in mixed streams recording mode.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Recording filename.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Recording start time, which is a Unix timestamp. Example: 1234567868.
    */
    @SerializedName("RecordBeginTime")
    @Expose
    private Long RecordBeginTime;

    /**
    * Recording status. Valid values: `2`: recording; `10`: to be transcoded; `11`: transcoding; `12`: uploading; `13`: uploaded; `14`: user notified.
    */
    @SerializedName("RecordStatus")
    @Expose
    private Long RecordStatus;

    /**
     * Get User ID. The value is `0` in mixed streams recording mode. 
     * @return UserId User ID. The value is `0` in mixed streams recording mode.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID. The value is `0` in mixed streams recording mode.
     * @param UserId User ID. The value is `0` in mixed streams recording mode.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Recording filename. 
     * @return FileName Recording filename.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Recording filename.
     * @param FileName Recording filename.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Recording start time, which is a Unix timestamp. Example: 1234567868. 
     * @return RecordBeginTime Recording start time, which is a Unix timestamp. Example: 1234567868.
     */
    public Long getRecordBeginTime() {
        return this.RecordBeginTime;
    }

    /**
     * Set Recording start time, which is a Unix timestamp. Example: 1234567868.
     * @param RecordBeginTime Recording start time, which is a Unix timestamp. Example: 1234567868.
     */
    public void setRecordBeginTime(Long RecordBeginTime) {
        this.RecordBeginTime = RecordBeginTime;
    }

    /**
     * Get Recording status. Valid values: `2`: recording; `10`: to be transcoded; `11`: transcoding; `12`: uploading; `13`: uploaded; `14`: user notified. 
     * @return RecordStatus Recording status. Valid values: `2`: recording; `10`: to be transcoded; `11`: transcoding; `12`: uploading; `13`: uploaded; `14`: user notified.
     */
    public Long getRecordStatus() {
        return this.RecordStatus;
    }

    /**
     * Set Recording status. Valid values: `2`: recording; `10`: to be transcoded; `11`: transcoding; `12`: uploading; `13`: uploaded; `14`: user notified.
     * @param RecordStatus Recording status. Valid values: `2`: recording; `10`: to be transcoded; `11`: transcoding; `12`: uploading; `13`: uploaded; `14`: user notified.
     */
    public void setRecordStatus(Long RecordStatus) {
        this.RecordStatus = RecordStatus;
    }

    public RecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordInfo(RecordInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.RecordBeginTime != null) {
            this.RecordBeginTime = new Long(source.RecordBeginTime);
        }
        if (source.RecordStatus != null) {
            this.RecordStatus = new Long(source.RecordStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "RecordBeginTime", this.RecordBeginTime);
        this.setParamSimple(map, prefix + "RecordStatus", this.RecordStatus);

    }
}

