package com.pratyush.kinesisdemo;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.aws.inbound.kinesis.Checkpointer;
import org.springframework.integration.aws.support.AwsHeaders;
import org.springframework.messaging.handler.annotation.Header;

@Slf4j
@EnableBinding(Channels.class)
public class Consumer2 {

  @StreamListener("s2")
  public void listenToStream(List payloadList,
      @Header(AwsHeaders.CHECKPOINTER) Checkpointer checkpointer) {
    log.info("In listenToStream");
    try {
      Thread.sleep(15000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
