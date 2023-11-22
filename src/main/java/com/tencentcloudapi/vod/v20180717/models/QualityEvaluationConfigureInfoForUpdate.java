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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityEvaluationConfigureInfoForUpdate extends AbstractModel {

    /**
    * Video quality evaluation switch, optional values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Video quality evaluation filter threshold, the result only returns the time periods lower than this value, the default value is 60.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get Video quality evaluation switch, optional values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li> 
     * @return Switch Video quality evaluation switch, optional values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Video quality evaluation switch, optional values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>
     * @param Switch Video quality evaluation switch, optional values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Video quality evaluation filter threshold, the result only returns the time periods lower than this value, the default value is 60. 
     * @return Score Video quality evaluation filter threshold, the result only returns the time periods lower than this value, the default value is 60.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set Video quality evaluation filter threshold, the result only returns the time periods lower than this value, the default value is 60.
     * @param Score Video quality evaluation filter threshold, the result only returns the time periods lower than this value, the default value is 60.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    public QualityEvaluationConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityEvaluationConfigureInfoForUpdate(QualityEvaluationConfigureInfoForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

