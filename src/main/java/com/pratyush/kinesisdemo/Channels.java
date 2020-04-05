package com.pratyush.kinesisdemo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Channels {

  @Input
  SubscribableChannel s1();

  @Input
  SubscribableChannel s2();

}
