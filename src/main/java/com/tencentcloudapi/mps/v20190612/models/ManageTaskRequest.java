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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageTaskRequest extends AbstractModel {

    /**
    * Operation type. Valid values:
<ul>
<li>Abort: task termination. Description:
<ul><li>If the [task type](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is live stream processing (`LiveStreamProcessTask`), tasks whose [task status](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is `WAITING` or `PROCESSING` can be terminated.</li>
<li>For other [task types](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0), only tasks whose [task status](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is `WAITING` can be terminated.</li></ul>
</li></ul>
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * Video processing task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get Operation type. Valid values:
<ul>
<li>Abort: task termination. Description:
<ul><li>If the [task type](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is live stream processing (`LiveStreamProcessTask`), tasks whose [task status](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is `WAITING` or `PROCESSING` can be terminated.</li>
<li>For other [task types](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0), only tasks whose [task status](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is `WAITING` can be terminated.</li></ul>
</li></ul> 
     * @return OperationType Operation type. Valid values:
<ul>
<li>Abort: task termination. Description:
<ul><li>If the [task type](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is live stream processing (`LiveStreamProcessTask`), tasks whose [task status](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is `WAITING` or `PROCESSING` can be terminated.</li>
<li>For other [task types](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0), only tasks whose [task status](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is `WAITING` can be terminated.</li></ul>
</li></ul>
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set Operation type. Valid values:
<ul>
<li>Abort: task termination. Description:
<ul><li>If the [task type](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is live stream processing (`LiveStreamProcessTask`), tasks whose [task status](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is `WAITING` or `PROCESSING` can be terminated.</li>
<li>For other [task types](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0), only tasks whose [task status](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is `WAITING` can be terminated.</li></ul>
</li></ul>
     * @param OperationType Operation type. Valid values:
<ul>
<li>Abort: task termination. Description:
<ul><li>If the [task type](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is live stream processing (`LiveStreamProcessTask`), tasks whose [task status](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is `WAITING` or `PROCESSING` can be terminated.</li>
<li>For other [task types](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0), only tasks whose [task status](https://intl.cloud.tencent.com/document/product/862/37614?from_cn_redirect=1#3.-.E8.BE.93.E5.87.BA.E5.8F.82.E6.95.B0) is `WAITING` can be terminated.</li></ul>
</li></ul>
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get Video processing task ID. 
     * @return TaskId Video processing task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Video processing task ID.
     * @param TaskId Video processing task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public ManageTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManageTaskRequest(ManageTaskRequest source) {
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

