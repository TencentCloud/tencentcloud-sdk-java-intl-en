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

public class TimeRange extends AbstractModel {

    /**
    * <li>Equal to or greater than this time (start time).</li>
<li>Format according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
    */
    @SerializedName("After")
    @Expose
    private String After;

    /**
    * <li>Less than this time (end time).</li>
<li>Format according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
    */
    @SerializedName("Before")
    @Expose
    private String Before;

    /**
     * Get <li>Equal to or greater than this time (start time).</li>
<li>Format according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li> 
     * @return After <li>Equal to or greater than this time (start time).</li>
<li>Format according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     */
    public String getAfter() {
        return this.After;
    }

    /**
     * Set <li>Equal to or greater than this time (start time).</li>
<li>Format according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     * @param After <li>Equal to or greater than this time (start time).</li>
<li>Format according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     */
    public void setAfter(String After) {
        this.After = After;
    }

    /**
     * Get <li>Less than this time (end time).</li>
<li>Format according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li> 
     * @return Before <li>Less than this time (end time).</li>
<li>Format according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     */
    public String getBefore() {
        return this.Before;
    }

    /**
     * Set <li>Less than this time (end time).</li>
<li>Format according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     * @param Before <li>Less than this time (end time).</li>
<li>Format according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     */
    public void setBefore(String Before) {
        this.Before = Before;
    }

    public TimeRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeRange(TimeRange source) {
        if (source.After != null) {
            this.After = new String(source.After);
        }
        if (source.Before != null) {
            this.Before = new String(source.Before);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "After", this.After);
        this.setParamSimple(map, prefix + "Before", this.Before);

    }
}

