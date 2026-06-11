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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorNoticeRule extends AbstractModel {

    /**
    * <p>Tencent Cloud observability platform notification template ID</p>
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * <p>ID of the Tencent Cloud observability platform content template. The default content template is used when empty.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContentTmplId")
    @Expose
    private String ContentTmplId;

    /**
    * <p>Alarm level. 0: Warn; 1: Information; 2: Critical</p>
    */
    @SerializedName("AlarmLevels")
    @Expose
    private Long [] AlarmLevels;

    /**
     * Get <p>Tencent Cloud observability platform notification template ID</p> 
     * @return NoticeId <p>Tencent Cloud observability platform notification template ID</p>
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set <p>Tencent Cloud observability platform notification template ID</p>
     * @param NoticeId <p>Tencent Cloud observability platform notification template ID</p>
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get <p>ID of the Tencent Cloud observability platform content template. The default content template is used when empty.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContentTmplId <p>ID of the Tencent Cloud observability platform content template. The default content template is used when empty.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContentTmplId() {
        return this.ContentTmplId;
    }

    /**
     * Set <p>ID of the Tencent Cloud observability platform content template. The default content template is used when empty.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContentTmplId <p>ID of the Tencent Cloud observability platform content template. The default content template is used when empty.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContentTmplId(String ContentTmplId) {
        this.ContentTmplId = ContentTmplId;
    }

    /**
     * Get <p>Alarm level. 0: Warn; 1: Information; 2: Critical</p> 
     * @return AlarmLevels <p>Alarm level. 0: Warn; 1: Information; 2: Critical</p>
     */
    public Long [] getAlarmLevels() {
        return this.AlarmLevels;
    }

    /**
     * Set <p>Alarm level. 0: Warn; 1: Information; 2: Critical</p>
     * @param AlarmLevels <p>Alarm level. 0: Warn; 1: Information; 2: Critical</p>
     */
    public void setAlarmLevels(Long [] AlarmLevels) {
        this.AlarmLevels = AlarmLevels;
    }

    public MonitorNoticeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorNoticeRule(MonitorNoticeRule source) {
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.ContentTmplId != null) {
            this.ContentTmplId = new String(source.ContentTmplId);
        }
        if (source.AlarmLevels != null) {
            this.AlarmLevels = new Long[source.AlarmLevels.length];
            for (int i = 0; i < source.AlarmLevels.length; i++) {
                this.AlarmLevels[i] = new Long(source.AlarmLevels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamSimple(map, prefix + "ContentTmplId", this.ContentTmplId);
        this.setParamArraySimple(map, prefix + "AlarmLevels.", this.AlarmLevels);

    }
}

