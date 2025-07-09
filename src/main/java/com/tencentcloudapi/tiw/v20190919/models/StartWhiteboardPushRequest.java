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

public class StartWhiteboardPushRequest extends AbstractModel {

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Room ID of the whiteboard push task. Valid range: (1,4294967295).

1. By default, the whiteboard push task uses the RoomId string as the GroupID of the IM group. For example, if the RoomId string is 1234, the GroupID of the IM group is also 1234. Message synchronization requires joining a group. Make sure that an IM group is created before the push starts. Otherwise, the push fails.
2. If neither TRTCRoomId nor TRTCRoomIdStr is specified, the value of RoomId is used as the Tencent Real-Time Communication (TRTC) room ID for the whiteboard push task.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * User ID used by the whiteboard push service for entering the whiteboard room. If `IMAuthParam`and `TRTCAuthParam` are not specified, this user ID is used for operations such as logging in to the IM application, joining an IM group, and entering the room for TRTC whiteboard push.
The ID cannot exceed 60 bytes in length and must be an unused ID. The whiteboard push service uses the user ID to enter the room for whiteboard audio/video push. If this ID is already used in another scenario, the other scenario and whiteboard push service will conflict, affecting the pushing operation.
    */
    @SerializedName("PushUserId")
    @Expose
    private String PushUserId;

    /**
    * User's IM signature corresponding to the PushUserId.
    */
    @SerializedName("PushUserSig")
    @Expose
    private String PushUserSig;

    /**
    * Whiteboard parameters, such as the width, height, and background color of the whiteboard.
    */
    @SerializedName("Whiteboard")
    @Expose
    private Whiteboard Whiteboard;

    /**
    * Whiteboard push timeout. Unit: seconds. Valid range: [300,259200]. Default value: 1800.

If no operation is performed on the whiteboard for the specified period of time, the whiteboard push service automatically stops whiteboard push.
    */
    @SerializedName("AutoStopTimeout")
    @Expose
    private Long AutoStopTimeout;

    /**
    * Specifies whether to synchronize operations on the primary whiteboard push task to the backup task.
    */
    @SerializedName("AutoManageBackup")
    @Expose
    private Boolean AutoManageBackup;

    /**
    * Parameters of the backup whiteboard push task.

After the backup parameters are specified, the whiteboard push service adds a relayed video stream. That is, there are two video streams on the whiteboard in the same room.
    */
    @SerializedName("Backup")
    @Expose
    private WhiteboardPushBackupParam Backup;

    /**
    * Advanced permission control parameter in TRTC. If the advanced permission control feature is enabled in TRTC, this parameter is required.
    */
    @SerializedName("PrivateMapKey")
    @Expose
    private String PrivateMapKey;

    /**
    * Frame rate of the whiteboard push video. Valid range: [0,30]. Default value: 20. Unit: fps.
    */
    @SerializedName("VideoFPS")
    @Expose
    private Long VideoFPS;

    /**
    * Whiteboard push bitrate. Valid range: [0,2000]. Default value: 1200. Unit: kbps.

The bitrate specified here is a reference value. During actual push, a dynamic bitrate is used. The actual bitrate does not remain the specified value but rather fluctuates around it.
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * Specifies whether to automatically record the whiteboard push when the recording mode in TRTC is set to `SubscribeStreamUserIds`.

Default value: `false`. If you need to enable automatic whiteboard push recording, set this parameter to `true`.

If the recording mode in TRTC is set to `Global Auto Recording`, ignore this parameter.
    */
    @SerializedName("AutoRecord")
    @Expose
    private Boolean AutoRecord;

    /**
    * ID of the whiteboard push recording. The ID is filled in the `userdefinerecordid` parameter in the callback message after cloud recording is complete in TRTC, helping you identify the recording callback and locate the video file in VOD media resource management.

The value can be up to 64 bytes in length and contain letters (a-z and A-Z), digits (0-9), underscores (_), and hyphens (-).

After this parameter is set, automatic whiteboard push recording is enabled regardless of the value of the `AutoRecord` parameter.

Default RecordId generation rule:
urlencode(SdkAppID_RoomID_PushUserID)

Example:
SdkAppID = 12345678，RoomID = 12345，PushUserID = push_user_1
Therefore: RecordId = 12345678_12345_push_user_1
    */
    @SerializedName("UserDefinedRecordId")
    @Expose
    private String UserDefinedRecordId;

    /**
    * Specifies whether to enable automatic relay whiteboard push when the relay push mode in TRTC is set to `SubscribeRelayUserIds`.

Default value: `false`. If you need to enable automatic relay whiteboard push, set this parameter to `true`.

If the recording mode in TRTC is set to `Global Auto Relay`, ignore this parameter.
    */
    @SerializedName("AutoPublish")
    @Expose
    private Boolean AutoPublish;

    /**
    * Stream ID used by TRTC for relay whiteboard push. With this ID, you can stream the user’s audio/video by using the domain name and standard streaming solution (FLV or HLS) in TRTC.

The value can be up to 64 bytes in length and contain letters (a-z and A-Z), digits (0-9), underscores (_), and hyphens (-).

After this parameter is set, automatic relay whiteboard push is enabled regardless of the value of the `AutoPublish` parameter.

Default StreamID generation rule:
urlencode(SdkAppID_RoomID_PushUserID_main)

Example:
SdkAppID = 12345678，RoomID = 12345，PushUserID = push_user_1
Therefore, StreamID = 12345678_12345_push_user_1_main
    */
    @SerializedName("UserDefinedStreamId")
    @Expose
    private String UserDefinedStreamId;

    /**
    * Internal parameter. You can ignore this parameter.
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
    * TRTC room ID of the numeric type. Valid range: (1,4294967295).

If RoomId and TRTCRoomId are both specified, the value of TRTCRoomId takes priority as the room ID for TRTC whiteboard push.

If the TRTCRoomIdStr parameter is specified, this parameter is ignored.
    */
    @SerializedName("TRTCRoomId")
    @Expose
    private Long TRTCRoomId;

    /**
    * TRTC room ID of the string type.

If TRTCRoomIdStr is specified, its value takes priority as the room ID for TRTC whiteboard push.
    */
    @SerializedName("TRTCRoomIdStr")
    @Expose
    private String TRTCRoomIdStr;

    /**
    * IM authentication parameters.
If the ID of the IM application used by whiteboard messages is different from SdkAppId of the whiteboard application, specify this parameter to provide authentication information of the IM application.

If this parameter is specified, the whiteboard push service preferably uses the SdkAppId value in this parameter as the transmission channel for whiteboard messages. If this parameter is left empty, the SdkAppId value in the common parameters is used.
    */
    @SerializedName("IMAuthParam")
    @Expose
    private AuthParam IMAuthParam;

    /**
    * TRTC authentication parameters, used for room entrance authentication for TRTC push.
If the ID of the TRTC application to which the target TRTC room belongs is different from SdkAppId of the whiteboard application, specify this parameter to provide authentication information of the TRTC application.

If this parameter is specified, the whiteboard push service preferably uses the SdkAppId value in this parameter as the ID of the target TRTC application. If this parameter is left empty, the SdkAppId value in the common parameters is used.
    */
    @SerializedName("TRTCAuthParam")
    @Expose
    private AuthParam TRTCAuthParam;

    /**
    * This parameter is available only to users in the allowlist for trial.

TRTC room entrance mode for whiteboard push. Default value: `TRTCAppSceneVideoCall`.

`TRTCAppSceneVideoCall`: This scenario is most suitable when there are two or more people on a video call. The internal encoders and network protocols are optimized for video smoothness to reduce call latency and lagging.
`TRTCAppSceneLIVE`: This scenario is most suitable when there is only one person speaking or performing for an online audience, and occasionally multiple people interact with one another through video. The internal encoders and network protocols are optimized for performance and compatibility to deliver better performance and video clarity.
    */
    @SerializedName("TRTCEnterRoomMode")
    @Expose
    private String TRTCEnterRoomMode;

    /**
     * Get SdkAppId of the whiteboard application. 
     * @return SdkAppId SdkAppId of the whiteboard application.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the whiteboard application.
     * @param SdkAppId SdkAppId of the whiteboard application.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Room ID of the whiteboard push task. Valid range: (1,4294967295).

1. By default, the whiteboard push task uses the RoomId string as the GroupID of the IM group. For example, if the RoomId string is 1234, the GroupID of the IM group is also 1234. Message synchronization requires joining a group. Make sure that an IM group is created before the push starts. Otherwise, the push fails.
2. If neither TRTCRoomId nor TRTCRoomIdStr is specified, the value of RoomId is used as the Tencent Real-Time Communication (TRTC) room ID for the whiteboard push task. 
     * @return RoomId Room ID of the whiteboard push task. Valid range: (1,4294967295).

1. By default, the whiteboard push task uses the RoomId string as the GroupID of the IM group. For example, if the RoomId string is 1234, the GroupID of the IM group is also 1234. Message synchronization requires joining a group. Make sure that an IM group is created before the push starts. Otherwise, the push fails.
2. If neither TRTCRoomId nor TRTCRoomIdStr is specified, the value of RoomId is used as the Tencent Real-Time Communication (TRTC) room ID for the whiteboard push task.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID of the whiteboard push task. Valid range: (1,4294967295).

1. By default, the whiteboard push task uses the RoomId string as the GroupID of the IM group. For example, if the RoomId string is 1234, the GroupID of the IM group is also 1234. Message synchronization requires joining a group. Make sure that an IM group is created before the push starts. Otherwise, the push fails.
2. If neither TRTCRoomId nor TRTCRoomIdStr is specified, the value of RoomId is used as the Tencent Real-Time Communication (TRTC) room ID for the whiteboard push task.
     * @param RoomId Room ID of the whiteboard push task. Valid range: (1,4294967295).

1. By default, the whiteboard push task uses the RoomId string as the GroupID of the IM group. For example, if the RoomId string is 1234, the GroupID of the IM group is also 1234. Message synchronization requires joining a group. Make sure that an IM group is created before the push starts. Otherwise, the push fails.
2. If neither TRTCRoomId nor TRTCRoomIdStr is specified, the value of RoomId is used as the Tencent Real-Time Communication (TRTC) room ID for the whiteboard push task.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get User ID used by the whiteboard push service for entering the whiteboard room. If `IMAuthParam`and `TRTCAuthParam` are not specified, this user ID is used for operations such as logging in to the IM application, joining an IM group, and entering the room for TRTC whiteboard push.
The ID cannot exceed 60 bytes in length and must be an unused ID. The whiteboard push service uses the user ID to enter the room for whiteboard audio/video push. If this ID is already used in another scenario, the other scenario and whiteboard push service will conflict, affecting the pushing operation. 
     * @return PushUserId User ID used by the whiteboard push service for entering the whiteboard room. If `IMAuthParam`and `TRTCAuthParam` are not specified, this user ID is used for operations such as logging in to the IM application, joining an IM group, and entering the room for TRTC whiteboard push.
The ID cannot exceed 60 bytes in length and must be an unused ID. The whiteboard push service uses the user ID to enter the room for whiteboard audio/video push. If this ID is already used in another scenario, the other scenario and whiteboard push service will conflict, affecting the pushing operation.
     */
    public String getPushUserId() {
        return this.PushUserId;
    }

    /**
     * Set User ID used by the whiteboard push service for entering the whiteboard room. If `IMAuthParam`and `TRTCAuthParam` are not specified, this user ID is used for operations such as logging in to the IM application, joining an IM group, and entering the room for TRTC whiteboard push.
The ID cannot exceed 60 bytes in length and must be an unused ID. The whiteboard push service uses the user ID to enter the room for whiteboard audio/video push. If this ID is already used in another scenario, the other scenario and whiteboard push service will conflict, affecting the pushing operation.
     * @param PushUserId User ID used by the whiteboard push service for entering the whiteboard room. If `IMAuthParam`and `TRTCAuthParam` are not specified, this user ID is used for operations such as logging in to the IM application, joining an IM group, and entering the room for TRTC whiteboard push.
The ID cannot exceed 60 bytes in length and must be an unused ID. The whiteboard push service uses the user ID to enter the room for whiteboard audio/video push. If this ID is already used in another scenario, the other scenario and whiteboard push service will conflict, affecting the pushing operation.
     */
    public void setPushUserId(String PushUserId) {
        this.PushUserId = PushUserId;
    }

    /**
     * Get User's IM signature corresponding to the PushUserId. 
     * @return PushUserSig User's IM signature corresponding to the PushUserId.
     */
    public String getPushUserSig() {
        return this.PushUserSig;
    }

    /**
     * Set User's IM signature corresponding to the PushUserId.
     * @param PushUserSig User's IM signature corresponding to the PushUserId.
     */
    public void setPushUserSig(String PushUserSig) {
        this.PushUserSig = PushUserSig;
    }

    /**
     * Get Whiteboard parameters, such as the width, height, and background color of the whiteboard. 
     * @return Whiteboard Whiteboard parameters, such as the width, height, and background color of the whiteboard.
     */
    public Whiteboard getWhiteboard() {
        return this.Whiteboard;
    }

    /**
     * Set Whiteboard parameters, such as the width, height, and background color of the whiteboard.
     * @param Whiteboard Whiteboard parameters, such as the width, height, and background color of the whiteboard.
     */
    public void setWhiteboard(Whiteboard Whiteboard) {
        this.Whiteboard = Whiteboard;
    }

    /**
     * Get Whiteboard push timeout. Unit: seconds. Valid range: [300,259200]. Default value: 1800.

If no operation is performed on the whiteboard for the specified period of time, the whiteboard push service automatically stops whiteboard push. 
     * @return AutoStopTimeout Whiteboard push timeout. Unit: seconds. Valid range: [300,259200]. Default value: 1800.

If no operation is performed on the whiteboard for the specified period of time, the whiteboard push service automatically stops whiteboard push.
     */
    public Long getAutoStopTimeout() {
        return this.AutoStopTimeout;
    }

    /**
     * Set Whiteboard push timeout. Unit: seconds. Valid range: [300,259200]. Default value: 1800.

If no operation is performed on the whiteboard for the specified period of time, the whiteboard push service automatically stops whiteboard push.
     * @param AutoStopTimeout Whiteboard push timeout. Unit: seconds. Valid range: [300,259200]. Default value: 1800.

If no operation is performed on the whiteboard for the specified period of time, the whiteboard push service automatically stops whiteboard push.
     */
    public void setAutoStopTimeout(Long AutoStopTimeout) {
        this.AutoStopTimeout = AutoStopTimeout;
    }

    /**
     * Get Specifies whether to synchronize operations on the primary whiteboard push task to the backup task. 
     * @return AutoManageBackup Specifies whether to synchronize operations on the primary whiteboard push task to the backup task.
     */
    public Boolean getAutoManageBackup() {
        return this.AutoManageBackup;
    }

    /**
     * Set Specifies whether to synchronize operations on the primary whiteboard push task to the backup task.
     * @param AutoManageBackup Specifies whether to synchronize operations on the primary whiteboard push task to the backup task.
     */
    public void setAutoManageBackup(Boolean AutoManageBackup) {
        this.AutoManageBackup = AutoManageBackup;
    }

    /**
     * Get Parameters of the backup whiteboard push task.

After the backup parameters are specified, the whiteboard push service adds a relayed video stream. That is, there are two video streams on the whiteboard in the same room. 
     * @return Backup Parameters of the backup whiteboard push task.

After the backup parameters are specified, the whiteboard push service adds a relayed video stream. That is, there are two video streams on the whiteboard in the same room.
     */
    public WhiteboardPushBackupParam getBackup() {
        return this.Backup;
    }

    /**
     * Set Parameters of the backup whiteboard push task.

After the backup parameters are specified, the whiteboard push service adds a relayed video stream. That is, there are two video streams on the whiteboard in the same room.
     * @param Backup Parameters of the backup whiteboard push task.

After the backup parameters are specified, the whiteboard push service adds a relayed video stream. That is, there are two video streams on the whiteboard in the same room.
     */
    public void setBackup(WhiteboardPushBackupParam Backup) {
        this.Backup = Backup;
    }

    /**
     * Get Advanced permission control parameter in TRTC. If the advanced permission control feature is enabled in TRTC, this parameter is required. 
     * @return PrivateMapKey Advanced permission control parameter in TRTC. If the advanced permission control feature is enabled in TRTC, this parameter is required.
     */
    public String getPrivateMapKey() {
        return this.PrivateMapKey;
    }

    /**
     * Set Advanced permission control parameter in TRTC. If the advanced permission control feature is enabled in TRTC, this parameter is required.
     * @param PrivateMapKey Advanced permission control parameter in TRTC. If the advanced permission control feature is enabled in TRTC, this parameter is required.
     */
    public void setPrivateMapKey(String PrivateMapKey) {
        this.PrivateMapKey = PrivateMapKey;
    }

    /**
     * Get Frame rate of the whiteboard push video. Valid range: [0,30]. Default value: 20. Unit: fps. 
     * @return VideoFPS Frame rate of the whiteboard push video. Valid range: [0,30]. Default value: 20. Unit: fps.
     */
    public Long getVideoFPS() {
        return this.VideoFPS;
    }

    /**
     * Set Frame rate of the whiteboard push video. Valid range: [0,30]. Default value: 20. Unit: fps.
     * @param VideoFPS Frame rate of the whiteboard push video. Valid range: [0,30]. Default value: 20. Unit: fps.
     */
    public void setVideoFPS(Long VideoFPS) {
        this.VideoFPS = VideoFPS;
    }

    /**
     * Get Whiteboard push bitrate. Valid range: [0,2000]. Default value: 1200. Unit: kbps.

The bitrate specified here is a reference value. During actual push, a dynamic bitrate is used. The actual bitrate does not remain the specified value but rather fluctuates around it. 
     * @return VideoBitrate Whiteboard push bitrate. Valid range: [0,2000]. Default value: 1200. Unit: kbps.

The bitrate specified here is a reference value. During actual push, a dynamic bitrate is used. The actual bitrate does not remain the specified value but rather fluctuates around it.
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set Whiteboard push bitrate. Valid range: [0,2000]. Default value: 1200. Unit: kbps.

The bitrate specified here is a reference value. During actual push, a dynamic bitrate is used. The actual bitrate does not remain the specified value but rather fluctuates around it.
     * @param VideoBitrate Whiteboard push bitrate. Valid range: [0,2000]. Default value: 1200. Unit: kbps.

The bitrate specified here is a reference value. During actual push, a dynamic bitrate is used. The actual bitrate does not remain the specified value but rather fluctuates around it.
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get Specifies whether to automatically record the whiteboard push when the recording mode in TRTC is set to `SubscribeStreamUserIds`.

Default value: `false`. If you need to enable automatic whiteboard push recording, set this parameter to `true`.

If the recording mode in TRTC is set to `Global Auto Recording`, ignore this parameter. 
     * @return AutoRecord Specifies whether to automatically record the whiteboard push when the recording mode in TRTC is set to `SubscribeStreamUserIds`.

Default value: `false`. If you need to enable automatic whiteboard push recording, set this parameter to `true`.

If the recording mode in TRTC is set to `Global Auto Recording`, ignore this parameter.
     */
    public Boolean getAutoRecord() {
        return this.AutoRecord;
    }

    /**
     * Set Specifies whether to automatically record the whiteboard push when the recording mode in TRTC is set to `SubscribeStreamUserIds`.

Default value: `false`. If you need to enable automatic whiteboard push recording, set this parameter to `true`.

If the recording mode in TRTC is set to `Global Auto Recording`, ignore this parameter.
     * @param AutoRecord Specifies whether to automatically record the whiteboard push when the recording mode in TRTC is set to `SubscribeStreamUserIds`.

Default value: `false`. If you need to enable automatic whiteboard push recording, set this parameter to `true`.

If the recording mode in TRTC is set to `Global Auto Recording`, ignore this parameter.
     */
    public void setAutoRecord(Boolean AutoRecord) {
        this.AutoRecord = AutoRecord;
    }

    /**
     * Get ID of the whiteboard push recording. The ID is filled in the `userdefinerecordid` parameter in the callback message after cloud recording is complete in TRTC, helping you identify the recording callback and locate the video file in VOD media resource management.

The value can be up to 64 bytes in length and contain letters (a-z and A-Z), digits (0-9), underscores (_), and hyphens (-).

After this parameter is set, automatic whiteboard push recording is enabled regardless of the value of the `AutoRecord` parameter.

Default RecordId generation rule:
urlencode(SdkAppID_RoomID_PushUserID)

Example:
SdkAppID = 12345678，RoomID = 12345，PushUserID = push_user_1
Therefore: RecordId = 12345678_12345_push_user_1 
     * @return UserDefinedRecordId ID of the whiteboard push recording. The ID is filled in the `userdefinerecordid` parameter in the callback message after cloud recording is complete in TRTC, helping you identify the recording callback and locate the video file in VOD media resource management.

The value can be up to 64 bytes in length and contain letters (a-z and A-Z), digits (0-9), underscores (_), and hyphens (-).

After this parameter is set, automatic whiteboard push recording is enabled regardless of the value of the `AutoRecord` parameter.

Default RecordId generation rule:
urlencode(SdkAppID_RoomID_PushUserID)

Example:
SdkAppID = 12345678，RoomID = 12345，PushUserID = push_user_1
Therefore: RecordId = 12345678_12345_push_user_1
     */
    public String getUserDefinedRecordId() {
        return this.UserDefinedRecordId;
    }

    /**
     * Set ID of the whiteboard push recording. The ID is filled in the `userdefinerecordid` parameter in the callback message after cloud recording is complete in TRTC, helping you identify the recording callback and locate the video file in VOD media resource management.

The value can be up to 64 bytes in length and contain letters (a-z and A-Z), digits (0-9), underscores (_), and hyphens (-).

After this parameter is set, automatic whiteboard push recording is enabled regardless of the value of the `AutoRecord` parameter.

Default RecordId generation rule:
urlencode(SdkAppID_RoomID_PushUserID)

Example:
SdkAppID = 12345678，RoomID = 12345，PushUserID = push_user_1
Therefore: RecordId = 12345678_12345_push_user_1
     * @param UserDefinedRecordId ID of the whiteboard push recording. The ID is filled in the `userdefinerecordid` parameter in the callback message after cloud recording is complete in TRTC, helping you identify the recording callback and locate the video file in VOD media resource management.

The value can be up to 64 bytes in length and contain letters (a-z and A-Z), digits (0-9), underscores (_), and hyphens (-).

After this parameter is set, automatic whiteboard push recording is enabled regardless of the value of the `AutoRecord` parameter.

Default RecordId generation rule:
urlencode(SdkAppID_RoomID_PushUserID)

Example:
SdkAppID = 12345678，RoomID = 12345，PushUserID = push_user_1
Therefore: RecordId = 12345678_12345_push_user_1
     */
    public void setUserDefinedRecordId(String UserDefinedRecordId) {
        this.UserDefinedRecordId = UserDefinedRecordId;
    }

    /**
     * Get Specifies whether to enable automatic relay whiteboard push when the relay push mode in TRTC is set to `SubscribeRelayUserIds`.

Default value: `false`. If you need to enable automatic relay whiteboard push, set this parameter to `true`.

If the recording mode in TRTC is set to `Global Auto Relay`, ignore this parameter. 
     * @return AutoPublish Specifies whether to enable automatic relay whiteboard push when the relay push mode in TRTC is set to `SubscribeRelayUserIds`.

Default value: `false`. If you need to enable automatic relay whiteboard push, set this parameter to `true`.

If the recording mode in TRTC is set to `Global Auto Relay`, ignore this parameter.
     */
    public Boolean getAutoPublish() {
        return this.AutoPublish;
    }

    /**
     * Set Specifies whether to enable automatic relay whiteboard push when the relay push mode in TRTC is set to `SubscribeRelayUserIds`.

Default value: `false`. If you need to enable automatic relay whiteboard push, set this parameter to `true`.

If the recording mode in TRTC is set to `Global Auto Relay`, ignore this parameter.
     * @param AutoPublish Specifies whether to enable automatic relay whiteboard push when the relay push mode in TRTC is set to `SubscribeRelayUserIds`.

Default value: `false`. If you need to enable automatic relay whiteboard push, set this parameter to `true`.

If the recording mode in TRTC is set to `Global Auto Relay`, ignore this parameter.
     */
    public void setAutoPublish(Boolean AutoPublish) {
        this.AutoPublish = AutoPublish;
    }

    /**
     * Get Stream ID used by TRTC for relay whiteboard push. With this ID, you can stream the user’s audio/video by using the domain name and standard streaming solution (FLV or HLS) in TRTC.

The value can be up to 64 bytes in length and contain letters (a-z and A-Z), digits (0-9), underscores (_), and hyphens (-).

After this parameter is set, automatic relay whiteboard push is enabled regardless of the value of the `AutoPublish` parameter.

Default StreamID generation rule:
urlencode(SdkAppID_RoomID_PushUserID_main)

Example:
SdkAppID = 12345678，RoomID = 12345，PushUserID = push_user_1
Therefore, StreamID = 12345678_12345_push_user_1_main 
     * @return UserDefinedStreamId Stream ID used by TRTC for relay whiteboard push. With this ID, you can stream the user’s audio/video by using the domain name and standard streaming solution (FLV or HLS) in TRTC.

The value can be up to 64 bytes in length and contain letters (a-z and A-Z), digits (0-9), underscores (_), and hyphens (-).

After this parameter is set, automatic relay whiteboard push is enabled regardless of the value of the `AutoPublish` parameter.

Default StreamID generation rule:
urlencode(SdkAppID_RoomID_PushUserID_main)

Example:
SdkAppID = 12345678，RoomID = 12345，PushUserID = push_user_1
Therefore, StreamID = 12345678_12345_push_user_1_main
     */
    public String getUserDefinedStreamId() {
        return this.UserDefinedStreamId;
    }

    /**
     * Set Stream ID used by TRTC for relay whiteboard push. With this ID, you can stream the user’s audio/video by using the domain name and standard streaming solution (FLV or HLS) in TRTC.

The value can be up to 64 bytes in length and contain letters (a-z and A-Z), digits (0-9), underscores (_), and hyphens (-).

After this parameter is set, automatic relay whiteboard push is enabled regardless of the value of the `AutoPublish` parameter.

Default StreamID generation rule:
urlencode(SdkAppID_RoomID_PushUserID_main)

Example:
SdkAppID = 12345678，RoomID = 12345，PushUserID = push_user_1
Therefore, StreamID = 12345678_12345_push_user_1_main
     * @param UserDefinedStreamId Stream ID used by TRTC for relay whiteboard push. With this ID, you can stream the user’s audio/video by using the domain name and standard streaming solution (FLV or HLS) in TRTC.

The value can be up to 64 bytes in length and contain letters (a-z and A-Z), digits (0-9), underscores (_), and hyphens (-).

After this parameter is set, automatic relay whiteboard push is enabled regardless of the value of the `AutoPublish` parameter.

Default StreamID generation rule:
urlencode(SdkAppID_RoomID_PushUserID_main)

Example:
SdkAppID = 12345678，RoomID = 12345，PushUserID = push_user_1
Therefore, StreamID = 12345678_12345_push_user_1_main
     */
    public void setUserDefinedStreamId(String UserDefinedStreamId) {
        this.UserDefinedStreamId = UserDefinedStreamId;
    }

    /**
     * Get Internal parameter. You can ignore this parameter. 
     * @return ExtraData Internal parameter. You can ignore this parameter.
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set Internal parameter. You can ignore this parameter.
     * @param ExtraData Internal parameter. You can ignore this parameter.
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    /**
     * Get TRTC room ID of the numeric type. Valid range: (1,4294967295).

If RoomId and TRTCRoomId are both specified, the value of TRTCRoomId takes priority as the room ID for TRTC whiteboard push.

If the TRTCRoomIdStr parameter is specified, this parameter is ignored. 
     * @return TRTCRoomId TRTC room ID of the numeric type. Valid range: (1,4294967295).

If RoomId and TRTCRoomId are both specified, the value of TRTCRoomId takes priority as the room ID for TRTC whiteboard push.

If the TRTCRoomIdStr parameter is specified, this parameter is ignored.
     */
    public Long getTRTCRoomId() {
        return this.TRTCRoomId;
    }

    /**
     * Set TRTC room ID of the numeric type. Valid range: (1,4294967295).

If RoomId and TRTCRoomId are both specified, the value of TRTCRoomId takes priority as the room ID for TRTC whiteboard push.

If the TRTCRoomIdStr parameter is specified, this parameter is ignored.
     * @param TRTCRoomId TRTC room ID of the numeric type. Valid range: (1,4294967295).

If RoomId and TRTCRoomId are both specified, the value of TRTCRoomId takes priority as the room ID for TRTC whiteboard push.

If the TRTCRoomIdStr parameter is specified, this parameter is ignored.
     */
    public void setTRTCRoomId(Long TRTCRoomId) {
        this.TRTCRoomId = TRTCRoomId;
    }

    /**
     * Get TRTC room ID of the string type.

If TRTCRoomIdStr is specified, its value takes priority as the room ID for TRTC whiteboard push. 
     * @return TRTCRoomIdStr TRTC room ID of the string type.

If TRTCRoomIdStr is specified, its value takes priority as the room ID for TRTC whiteboard push.
     */
    public String getTRTCRoomIdStr() {
        return this.TRTCRoomIdStr;
    }

    /**
     * Set TRTC room ID of the string type.

If TRTCRoomIdStr is specified, its value takes priority as the room ID for TRTC whiteboard push.
     * @param TRTCRoomIdStr TRTC room ID of the string type.

If TRTCRoomIdStr is specified, its value takes priority as the room ID for TRTC whiteboard push.
     */
    public void setTRTCRoomIdStr(String TRTCRoomIdStr) {
        this.TRTCRoomIdStr = TRTCRoomIdStr;
    }

    /**
     * Get IM authentication parameters.
If the ID of the IM application used by whiteboard messages is different from SdkAppId of the whiteboard application, specify this parameter to provide authentication information of the IM application.

If this parameter is specified, the whiteboard push service preferably uses the SdkAppId value in this parameter as the transmission channel for whiteboard messages. If this parameter is left empty, the SdkAppId value in the common parameters is used. 
     * @return IMAuthParam IM authentication parameters.
If the ID of the IM application used by whiteboard messages is different from SdkAppId of the whiteboard application, specify this parameter to provide authentication information of the IM application.

If this parameter is specified, the whiteboard push service preferably uses the SdkAppId value in this parameter as the transmission channel for whiteboard messages. If this parameter is left empty, the SdkAppId value in the common parameters is used.
     */
    public AuthParam getIMAuthParam() {
        return this.IMAuthParam;
    }

    /**
     * Set IM authentication parameters.
If the ID of the IM application used by whiteboard messages is different from SdkAppId of the whiteboard application, specify this parameter to provide authentication information of the IM application.

If this parameter is specified, the whiteboard push service preferably uses the SdkAppId value in this parameter as the transmission channel for whiteboard messages. If this parameter is left empty, the SdkAppId value in the common parameters is used.
     * @param IMAuthParam IM authentication parameters.
If the ID of the IM application used by whiteboard messages is different from SdkAppId of the whiteboard application, specify this parameter to provide authentication information of the IM application.

If this parameter is specified, the whiteboard push service preferably uses the SdkAppId value in this parameter as the transmission channel for whiteboard messages. If this parameter is left empty, the SdkAppId value in the common parameters is used.
     */
    public void setIMAuthParam(AuthParam IMAuthParam) {
        this.IMAuthParam = IMAuthParam;
    }

    /**
     * Get TRTC authentication parameters, used for room entrance authentication for TRTC push.
If the ID of the TRTC application to which the target TRTC room belongs is different from SdkAppId of the whiteboard application, specify this parameter to provide authentication information of the TRTC application.

If this parameter is specified, the whiteboard push service preferably uses the SdkAppId value in this parameter as the ID of the target TRTC application. If this parameter is left empty, the SdkAppId value in the common parameters is used. 
     * @return TRTCAuthParam TRTC authentication parameters, used for room entrance authentication for TRTC push.
If the ID of the TRTC application to which the target TRTC room belongs is different from SdkAppId of the whiteboard application, specify this parameter to provide authentication information of the TRTC application.

If this parameter is specified, the whiteboard push service preferably uses the SdkAppId value in this parameter as the ID of the target TRTC application. If this parameter is left empty, the SdkAppId value in the common parameters is used.
     */
    public AuthParam getTRTCAuthParam() {
        return this.TRTCAuthParam;
    }

    /**
     * Set TRTC authentication parameters, used for room entrance authentication for TRTC push.
If the ID of the TRTC application to which the target TRTC room belongs is different from SdkAppId of the whiteboard application, specify this parameter to provide authentication information of the TRTC application.

If this parameter is specified, the whiteboard push service preferably uses the SdkAppId value in this parameter as the ID of the target TRTC application. If this parameter is left empty, the SdkAppId value in the common parameters is used.
     * @param TRTCAuthParam TRTC authentication parameters, used for room entrance authentication for TRTC push.
If the ID of the TRTC application to which the target TRTC room belongs is different from SdkAppId of the whiteboard application, specify this parameter to provide authentication information of the TRTC application.

If this parameter is specified, the whiteboard push service preferably uses the SdkAppId value in this parameter as the ID of the target TRTC application. If this parameter is left empty, the SdkAppId value in the common parameters is used.
     */
    public void setTRTCAuthParam(AuthParam TRTCAuthParam) {
        this.TRTCAuthParam = TRTCAuthParam;
    }

    /**
     * Get This parameter is available only to users in the allowlist for trial.

TRTC room entrance mode for whiteboard push. Default value: `TRTCAppSceneVideoCall`.

`TRTCAppSceneVideoCall`: This scenario is most suitable when there are two or more people on a video call. The internal encoders and network protocols are optimized for video smoothness to reduce call latency and lagging.
`TRTCAppSceneLIVE`: This scenario is most suitable when there is only one person speaking or performing for an online audience, and occasionally multiple people interact with one another through video. The internal encoders and network protocols are optimized for performance and compatibility to deliver better performance and video clarity. 
     * @return TRTCEnterRoomMode This parameter is available only to users in the allowlist for trial.

TRTC room entrance mode for whiteboard push. Default value: `TRTCAppSceneVideoCall`.

`TRTCAppSceneVideoCall`: This scenario is most suitable when there are two or more people on a video call. The internal encoders and network protocols are optimized for video smoothness to reduce call latency and lagging.
`TRTCAppSceneLIVE`: This scenario is most suitable when there is only one person speaking or performing for an online audience, and occasionally multiple people interact with one another through video. The internal encoders and network protocols are optimized for performance and compatibility to deliver better performance and video clarity.
     */
    public String getTRTCEnterRoomMode() {
        return this.TRTCEnterRoomMode;
    }

    /**
     * Set This parameter is available only to users in the allowlist for trial.

TRTC room entrance mode for whiteboard push. Default value: `TRTCAppSceneVideoCall`.

`TRTCAppSceneVideoCall`: This scenario is most suitable when there are two or more people on a video call. The internal encoders and network protocols are optimized for video smoothness to reduce call latency and lagging.
`TRTCAppSceneLIVE`: This scenario is most suitable when there is only one person speaking or performing for an online audience, and occasionally multiple people interact with one another through video. The internal encoders and network protocols are optimized for performance and compatibility to deliver better performance and video clarity.
     * @param TRTCEnterRoomMode This parameter is available only to users in the allowlist for trial.

TRTC room entrance mode for whiteboard push. Default value: `TRTCAppSceneVideoCall`.

`TRTCAppSceneVideoCall`: This scenario is most suitable when there are two or more people on a video call. The internal encoders and network protocols are optimized for video smoothness to reduce call latency and lagging.
`TRTCAppSceneLIVE`: This scenario is most suitable when there is only one person speaking or performing for an online audience, and occasionally multiple people interact with one another through video. The internal encoders and network protocols are optimized for performance and compatibility to deliver better performance and video clarity.
     */
    public void setTRTCEnterRoomMode(String TRTCEnterRoomMode) {
        this.TRTCEnterRoomMode = TRTCEnterRoomMode;
    }

    public StartWhiteboardPushRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartWhiteboardPushRequest(StartWhiteboardPushRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.PushUserId != null) {
            this.PushUserId = new String(source.PushUserId);
        }
        if (source.PushUserSig != null) {
            this.PushUserSig = new String(source.PushUserSig);
        }
        if (source.Whiteboard != null) {
            this.Whiteboard = new Whiteboard(source.Whiteboard);
        }
        if (source.AutoStopTimeout != null) {
            this.AutoStopTimeout = new Long(source.AutoStopTimeout);
        }
        if (source.AutoManageBackup != null) {
            this.AutoManageBackup = new Boolean(source.AutoManageBackup);
        }
        if (source.Backup != null) {
            this.Backup = new WhiteboardPushBackupParam(source.Backup);
        }
        if (source.PrivateMapKey != null) {
            this.PrivateMapKey = new String(source.PrivateMapKey);
        }
        if (source.VideoFPS != null) {
            this.VideoFPS = new Long(source.VideoFPS);
        }
        if (source.VideoBitrate != null) {
            this.VideoBitrate = new Long(source.VideoBitrate);
        }
        if (source.AutoRecord != null) {
            this.AutoRecord = new Boolean(source.AutoRecord);
        }
        if (source.UserDefinedRecordId != null) {
            this.UserDefinedRecordId = new String(source.UserDefinedRecordId);
        }
        if (source.AutoPublish != null) {
            this.AutoPublish = new Boolean(source.AutoPublish);
        }
        if (source.UserDefinedStreamId != null) {
            this.UserDefinedStreamId = new String(source.UserDefinedStreamId);
        }
        if (source.ExtraData != null) {
            this.ExtraData = new String(source.ExtraData);
        }
        if (source.TRTCRoomId != null) {
            this.TRTCRoomId = new Long(source.TRTCRoomId);
        }
        if (source.TRTCRoomIdStr != null) {
            this.TRTCRoomIdStr = new String(source.TRTCRoomIdStr);
        }
        if (source.IMAuthParam != null) {
            this.IMAuthParam = new AuthParam(source.IMAuthParam);
        }
        if (source.TRTCAuthParam != null) {
            this.TRTCAuthParam = new AuthParam(source.TRTCAuthParam);
        }
        if (source.TRTCEnterRoomMode != null) {
            this.TRTCEnterRoomMode = new String(source.TRTCEnterRoomMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "PushUserId", this.PushUserId);
        this.setParamSimple(map, prefix + "PushUserSig", this.PushUserSig);
        this.setParamObj(map, prefix + "Whiteboard.", this.Whiteboard);
        this.setParamSimple(map, prefix + "AutoStopTimeout", this.AutoStopTimeout);
        this.setParamSimple(map, prefix + "AutoManageBackup", this.AutoManageBackup);
        this.setParamObj(map, prefix + "Backup.", this.Backup);
        this.setParamSimple(map, prefix + "PrivateMapKey", this.PrivateMapKey);
        this.setParamSimple(map, prefix + "VideoFPS", this.VideoFPS);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "AutoRecord", this.AutoRecord);
        this.setParamSimple(map, prefix + "UserDefinedRecordId", this.UserDefinedRecordId);
        this.setParamSimple(map, prefix + "AutoPublish", this.AutoPublish);
        this.setParamSimple(map, prefix + "UserDefinedStreamId", this.UserDefinedStreamId);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
        this.setParamSimple(map, prefix + "TRTCRoomId", this.TRTCRoomId);
        this.setParamSimple(map, prefix + "TRTCRoomIdStr", this.TRTCRoomIdStr);
        this.setParamObj(map, prefix + "IMAuthParam.", this.IMAuthParam);
        this.setParamObj(map, prefix + "TRTCAuthParam.", this.TRTCAuthParam);
        this.setParamSimple(map, prefix + "TRTCEnterRoomMode", this.TRTCEnterRoomMode);

    }
}

