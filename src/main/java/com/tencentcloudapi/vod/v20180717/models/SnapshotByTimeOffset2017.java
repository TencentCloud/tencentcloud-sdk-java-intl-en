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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotByTimeOffset2017 extends AbstractModel {

    /**
    * Error code.
<li>0: success;</li>
<li>Other value: failure.</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Screenshot time, in ms.
    */
    @SerializedName("TimeOffset")
    @Expose
    private Long TimeOffset;

    /**
    * Screenshot output file address.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Error code.
<li>0: success;</li>
<li>Other value: failure.</li> 
     * @return ErrCode Error code.
<li>0: success;</li>
<li>Other value: failure.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code.
<li>0: success;</li>
<li>Other value: failure.</li>
     * @param ErrCode Error code.
<li>0: success;</li>
<li>Other value: failure.</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Screenshot time, in ms. 
     * @return TimeOffset Screenshot time, in ms.
     */
    public Long getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set Screenshot time, in ms.
     * @param TimeOffset Screenshot time, in ms.
     */
    public void setTimeOffset(Long TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    /**
     * Get Screenshot output file address. 
     * @return Url Screenshot output file address.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Screenshot output file address.
     * @param Url Screenshot output file address.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public SnapshotByTimeOffset2017() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotByTimeOffset2017(SnapshotByTimeOffset2017 source) {
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.TimeOffset != null) {
            this.TimeOffset = new Long(source.TimeOffset);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "TimeOffset", this.TimeOffset);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

