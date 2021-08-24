/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskObjectResultOutput extends AbstractModel{

    /**
    * Intelligent object recognition result set
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`.
    */
    @SerializedName("ResultSet")
    @Expose
    private AiRecognitionTaskObjectResultItem [] ResultSet;

    /**
    * URL to the file of the object recognition result set. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently.
    */
    @SerializedName("ResultSetFileUrl")
    @Expose
    private String ResultSetFileUrl;

    /**
    * Expiration time of the URL to the object recognition result set, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
    */
    @SerializedName("ResultSetFileUrlExpireTime")
    @Expose
    private String ResultSetFileUrlExpireTime;

    /**
     * Get Intelligent object recognition result set
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`. 
     * @return ResultSet Intelligent object recognition result set
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`.
     */
    public AiRecognitionTaskObjectResultItem [] getResultSet() {
        return this.ResultSet;
    }

    /**
     * Set Intelligent object recognition result set
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`.
     * @param ResultSet Intelligent object recognition result set
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`.
     */
    public void setResultSet(AiRecognitionTaskObjectResultItem [] ResultSet) {
        this.ResultSet = ResultSet;
    }

    /**
     * Get URL to the file of the object recognition result set. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently. 
     * @return ResultSetFileUrl URL to the file of the object recognition result set. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently.
     */
    public String getResultSetFileUrl() {
        return this.ResultSetFileUrl;
    }

    /**
     * Set URL to the file of the object recognition result set. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently.
     * @param ResultSetFileUrl URL to the file of the object recognition result set. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently.
     */
    public void setResultSetFileUrl(String ResultSetFileUrl) {
        this.ResultSetFileUrl = ResultSetFileUrl;
    }

    /**
     * Get Expiration time of the URL to the object recognition result set, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732) 
     * @return ResultSetFileUrlExpireTime Expiration time of the URL to the object recognition result set, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
     */
    public String getResultSetFileUrlExpireTime() {
        return this.ResultSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the URL to the object recognition result set, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
     * @param ResultSetFileUrlExpireTime Expiration time of the URL to the object recognition result set, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
     */
    public void setResultSetFileUrlExpireTime(String ResultSetFileUrlExpireTime) {
        this.ResultSetFileUrlExpireTime = ResultSetFileUrlExpireTime;
    }

    public AiRecognitionTaskObjectResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskObjectResultOutput(AiRecognitionTaskObjectResultOutput source) {
        if (source.ResultSet != null) {
            this.ResultSet = new AiRecognitionTaskObjectResultItem[source.ResultSet.length];
            for (int i = 0; i < source.ResultSet.length; i++) {
                this.ResultSet[i] = new AiRecognitionTaskObjectResultItem(source.ResultSet[i]);
            }
        }
        if (source.ResultSetFileUrl != null) {
            this.ResultSetFileUrl = new String(source.ResultSetFileUrl);
        }
        if (source.ResultSetFileUrlExpireTime != null) {
            this.ResultSetFileUrlExpireTime = new String(source.ResultSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ResultSet.", this.ResultSet);
        this.setParamSimple(map, prefix + "ResultSetFileUrl", this.ResultSetFileUrl);
        this.setParamSimple(map, prefix + "ResultSetFileUrlExpireTime", this.ResultSetFileUrlExpireTime);

    }
}

