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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhiteboardPushBackupParam extends AbstractModel {

    /**
    * User ID used by the whiteboard push service for entering a room,
The ID must be an unused ID in the SDK. The whiteboard push service uses the user ID to enter the room for whiteboard push. If this ID is already used in the SDK, the SDK and recording service will conflict, affecting the pushing operation.
    */
    @SerializedName("PushUserId")
    @Expose
    private String PushUserId;

    /**
    * Signature corresponding to the PushUserId ID.
    */
    @SerializedName("PushUserSig")
    @Expose
    private String PushUserSig;

    /**
     * Get User ID used by the whiteboard push service for entering a room,
The ID must be an unused ID in the SDK. The whiteboard push service uses the user ID to enter the room for whiteboard push. If this ID is already used in the SDK, the SDK and recording service will conflict, affecting the pushing operation. 
     * @return PushUserId User ID used by the whiteboard push service for entering a room,
The ID must be an unused ID in the SDK. The whiteboard push service uses the user ID to enter the room for whiteboard push. If this ID is already used in the SDK, the SDK and recording service will conflict, affecting the pushing operation.
     */
    public String getPushUserId() {
        return this.PushUserId;
    }

    /**
     * Set User ID used by the whiteboard push service for entering a room,
The ID must be an unused ID in the SDK. The whiteboard push service uses the user ID to enter the room for whiteboard push. If this ID is already used in the SDK, the SDK and recording service will conflict, affecting the pushing operation.
     * @param PushUserId User ID used by the whiteboard push service for entering a room,
The ID must be an unused ID in the SDK. The whiteboard push service uses the user ID to enter the room for whiteboard push. If this ID is already used in the SDK, the SDK and recording service will conflict, affecting the pushing operation.
     */
    public void setPushUserId(String PushUserId) {
        this.PushUserId = PushUserId;
    }

    /**
     * Get Signature corresponding to the PushUserId ID. 
     * @return PushUserSig Signature corresponding to the PushUserId ID.
     */
    public String getPushUserSig() {
        return this.PushUserSig;
    }

    /**
     * Set Signature corresponding to the PushUserId ID.
     * @param PushUserSig Signature corresponding to the PushUserId ID.
     */
    public void setPushUserSig(String PushUserSig) {
        this.PushUserSig = PushUserSig;
    }

    public WhiteboardPushBackupParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhiteboardPushBackupParam(WhiteboardPushBackupParam source) {
        if (source.PushUserId != null) {
            this.PushUserId = new String(source.PushUserId);
        }
        if (source.PushUserSig != null) {
            this.PushUserSig = new String(source.PushUserSig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PushUserId", this.PushUserId);
        this.setParamSimple(map, prefix + "PushUserSig", this.PushUserSig);

    }
}

