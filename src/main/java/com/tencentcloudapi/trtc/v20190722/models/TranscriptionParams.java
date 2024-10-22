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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranscriptionParams extends AbstractModel {

    /**
    * The robot's UserId is used to enter a room and initiate tasks. [Note] This UserId cannot be repeated with the host viewer [UserId](https://cloud.tencent.com/document/product/647/46351#userid) in the current room. If multiple tasks are initiated in a room, the robot's UserId cannot be repeated, otherwise the previous task will be interrupted. The robot's UserId must be unique in the room.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The verification signature corresponding to the robot's UserId, that is, UserId and UserSig are equivalent to the robot's login password to enter the room. For the specific calculation method, please refer to the TRTC calculation [UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig) solution.
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * If there is no streaming in the room for more than MaxIdleTime, the background will automatically close the task. The default value is 60s.
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * 1 means the robot subscribes to the stream of only one person, 0 means the robot subscribes to the stream of the entire room. If it is not filled in, the robot subscribes to the stream of the entire room by default.
    */
    @SerializedName("TranscriptionMode")
    @Expose
    private Long TranscriptionMode;

    /**
    * Required when TranscriptionMode is 1. The robot will only pull the stream of the userid and ignore other users in the room.
    */
    @SerializedName("TargetUserId")
    @Expose
    private String TargetUserId;

    /**
     * Get The robot's UserId is used to enter a room and initiate tasks. [Note] This UserId cannot be repeated with the host viewer [UserId](https://cloud.tencent.com/document/product/647/46351#userid) in the current room. If multiple tasks are initiated in a room, the robot's UserId cannot be repeated, otherwise the previous task will be interrupted. The robot's UserId must be unique in the room. 
     * @return UserId The robot's UserId is used to enter a room and initiate tasks. [Note] This UserId cannot be repeated with the host viewer [UserId](https://cloud.tencent.com/document/product/647/46351#userid) in the current room. If multiple tasks are initiated in a room, the robot's UserId cannot be repeated, otherwise the previous task will be interrupted. The robot's UserId must be unique in the room.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The robot's UserId is used to enter a room and initiate tasks. [Note] This UserId cannot be repeated with the host viewer [UserId](https://cloud.tencent.com/document/product/647/46351#userid) in the current room. If multiple tasks are initiated in a room, the robot's UserId cannot be repeated, otherwise the previous task will be interrupted. The robot's UserId must be unique in the room.
     * @param UserId The robot's UserId is used to enter a room and initiate tasks. [Note] This UserId cannot be repeated with the host viewer [UserId](https://cloud.tencent.com/document/product/647/46351#userid) in the current room. If multiple tasks are initiated in a room, the robot's UserId cannot be repeated, otherwise the previous task will be interrupted. The robot's UserId must be unique in the room.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The verification signature corresponding to the robot's UserId, that is, UserId and UserSig are equivalent to the robot's login password to enter the room. For the specific calculation method, please refer to the TRTC calculation [UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig) solution. 
     * @return UserSig The verification signature corresponding to the robot's UserId, that is, UserId and UserSig are equivalent to the robot's login password to enter the room. For the specific calculation method, please refer to the TRTC calculation [UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig) solution.
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set The verification signature corresponding to the robot's UserId, that is, UserId and UserSig are equivalent to the robot's login password to enter the room. For the specific calculation method, please refer to the TRTC calculation [UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig) solution.
     * @param UserSig The verification signature corresponding to the robot's UserId, that is, UserId and UserSig are equivalent to the robot's login password to enter the room. For the specific calculation method, please refer to the TRTC calculation [UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig) solution.
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get If there is no streaming in the room for more than MaxIdleTime, the background will automatically close the task. The default value is 60s. 
     * @return MaxIdleTime If there is no streaming in the room for more than MaxIdleTime, the background will automatically close the task. The default value is 60s.
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set If there is no streaming in the room for more than MaxIdleTime, the background will automatically close the task. The default value is 60s.
     * @param MaxIdleTime If there is no streaming in the room for more than MaxIdleTime, the background will automatically close the task. The default value is 60s.
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get 1 means the robot subscribes to the stream of only one person, 0 means the robot subscribes to the stream of the entire room. If it is not filled in, the robot subscribes to the stream of the entire room by default. 
     * @return TranscriptionMode 1 means the robot subscribes to the stream of only one person, 0 means the robot subscribes to the stream of the entire room. If it is not filled in, the robot subscribes to the stream of the entire room by default.
     */
    public Long getTranscriptionMode() {
        return this.TranscriptionMode;
    }

    /**
     * Set 1 means the robot subscribes to the stream of only one person, 0 means the robot subscribes to the stream of the entire room. If it is not filled in, the robot subscribes to the stream of the entire room by default.
     * @param TranscriptionMode 1 means the robot subscribes to the stream of only one person, 0 means the robot subscribes to the stream of the entire room. If it is not filled in, the robot subscribes to the stream of the entire room by default.
     */
    public void setTranscriptionMode(Long TranscriptionMode) {
        this.TranscriptionMode = TranscriptionMode;
    }

    /**
     * Get Required when TranscriptionMode is 1. The robot will only pull the stream of the userid and ignore other users in the room. 
     * @return TargetUserId Required when TranscriptionMode is 1. The robot will only pull the stream of the userid and ignore other users in the room.
     */
    public String getTargetUserId() {
        return this.TargetUserId;
    }

    /**
     * Set Required when TranscriptionMode is 1. The robot will only pull the stream of the userid and ignore other users in the room.
     * @param TargetUserId Required when TranscriptionMode is 1. The robot will only pull the stream of the userid and ignore other users in the room.
     */
    public void setTargetUserId(String TargetUserId) {
        this.TargetUserId = TargetUserId;
    }

    public TranscriptionParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscriptionParams(TranscriptionParams source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.TranscriptionMode != null) {
            this.TranscriptionMode = new Long(source.TranscriptionMode);
        }
        if (source.TargetUserId != null) {
            this.TargetUserId = new String(source.TargetUserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "TranscriptionMode", this.TranscriptionMode);
        this.setParamSimple(map, prefix + "TargetUserId", this.TargetUserId);

    }
}

